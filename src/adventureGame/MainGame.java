package adventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainGame {
	/*
	 * Change the program to allow players to type full words or phrases, then
	 * move to the correct location based upon their input.
	 * The player should be able to type commands such as "Go West", "run South"
	 * */
	private static Map<Integer, Location> location = new HashMap<Integer, Location>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> tmpExits = new HashMap<String, Integer>();

		location.put(0, new Location(0, "Te fuiste",tmpExits));

		tmpExits = new HashMap<>();
		tmpExits.put("W", 2);
		tmpExits.put("E", 3);
		tmpExits.put("S", 4);
		tmpExits.put("N", 5);
		location.put(1, new Location(1, "You are sitting in front of a computer",tmpExits));

		tmpExits = new HashMap<>();
		tmpExits.put("N", 5);
		location.put(2, new Location(2, "te juiste lejos ameo",tmpExits));

		tmpExits = new HashMap<>();
		tmpExits.put("W", 1);
		tmpExits.put("Q", 0);
		location.put(3, new Location(3, "Encarando para Burzaco City",tmpExits));

		tmpExits = new HashMap<>();
		tmpExits.put("N", 1);
		tmpExits.put("W", 2);
		location.put(4, new Location(4, "Estas yendo a Constitucion, cuidado con la billetera.",tmpExits));

		tmpExits.put("S", 1);
		tmpExits.put("W", 2);
		location.put(5, new Location(5, "Entrando a Chetoslovakia.",tmpExits));

		int loc = 1;

		while (true) {
			System.out.println(location.get(loc).getDescription());
			if (loc==0) {
				break;
			}
			Map<String, Integer> exits = location.get(loc).getExits();
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

			if(direction.length() > 0){
				String[] frase = direction.split(" ");
				for(String palabra : frase){
					if(dictionary.containsKey(palabra)){
						direction = dictionary.get(palabra);
						break;
					}
				}
			}

			//
			// for (String palabra : frase) {
			// 	switch (palabra) {
			// 		case "SOUTH":
			// 			direction = "S";
			// 			break;
			// 		case "NORTH":
			// 			direction = "N";
			// 			break;
			// 		case "WEST":
			// 			direction = "W";
			// 			break;
			// 		case "EAST":
			// 			direction = "E";
			// 			break;
			// 	}
			// }
			// System.out.println("direction: " + direction);

			if (exits.containsKey(direction)) {
				loc = exits.get(direction);
			} else {
				System.out.println("you cant log in that direction");
			}

		}
	}
}
