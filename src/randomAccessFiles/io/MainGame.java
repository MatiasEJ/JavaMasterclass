package randomAccessFiles.io;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainGame {
	/*
	 * Change the program to allow players to type full words or phrases, then
	 * move to the correct location based upon their input.
	 * The player should be able to type commands such as "Go West", "run South"
	 * */
	private static Locations locations = new Locations();


	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int loc = 64;

		Location currentLocation = locations.getLocation(loc);

		while (true) {
			System.out.println(locations.get(loc).getDescription());
			if (currentLocation.getLocationId() == 0) {
				break;
			}
			Map<String, Integer> exits = currentLocation.getExits();
			System.out.println("Available exits are (Q to quit): ");

			for (String exit : exits.keySet()) {
				System.out.print(exit + ", ");
			}
			System.out.println();


			String              direction  = scanner.nextLine().toUpperCase();
			Map<String, String> dictionary = new HashMap<String, String>();
			dictionary.put("SOUTH", "S");
			dictionary.put("NORTH", "N");
			dictionary.put("WEST", "W");
			dictionary.put("EAST", "E");
			dictionary.put("QUIT", "Q");

			if (direction.length() > 0) {
				String[] frase = direction.split(" ");
				for (String palabra : frase) {
					if (dictionary.containsKey(palabra)) {
						direction = dictionary.get(palabra);
						break;
					}
				}
			}

			if (exits.containsKey(direction)) {
				currentLocation = locations.getLocation(currentLocation.getExits().get(direction));
			} else {
				System.out.println("you cant log in that direction");
			}

		}
		locations.close();
	}
}
