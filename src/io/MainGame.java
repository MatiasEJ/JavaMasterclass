package io;

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



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int loc = 1;

		while (true) {
			System.out.println(locations.get(loc).getDescription());
			if (loc==0) {
				break;
			}
			Map<String, Integer> exits = locations.get(loc).getExits();
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
