package io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
	private static Map<Integer, Location> locations = new HashMap<>();

	public static void main(String[] args) throws IOException {
		// FileWriter locFile = null;
		// try {
		// 	locFile = new FileWriter("locations.txt");
		// 	for (Location location : locations.values()) {
		// 		locFile.write(location.getLocationId() + "," + location
		// 		.getDescription() + "\n");
		// 	}
		// } finally {
		// 	System.out.println("in Finally block");
		// 	if (locFile != null) {
		// 		System.out.println("attempting to close file");
		// 		locFile.close();
		// 	}
		// }
		// try (FileWriter locFile = new FileWriter("locations.txt");
		// FileWriter dirFile = new FileWriter("directions.txt")) {
		// 	for (Location location : locations.values()) {
		// 		locFile.write(location.getLocationId() + "," + location
		// 		.getDescription() + "\n");
		// 		for (String direction : location.getExits().keySet()){
		// 			dirFile.write(location.getLocationId()+","+direction+",
		// 			"+location.getExits().get(direction)+"\n");
		// 		}
		// 	}
		// }
		//	BYTESTREAMS

		try (DataOutputStream locFile =
				     new DataOutputStream(
						     new BufferedOutputStream(
								     new FileOutputStream("locations.dat"))
				     )) {
			for (Location location : locations.values()) {
				locFile.writeInt(location.getLocationId());
				locFile.writeUTF(location.getDescription());
				System.out.println(location.getLocationId() + location.getDescription());
				System.out.println(location.getExits().size());
				locFile.writeInt(location.getExits().size());
				for (String direction : location.getExits().keySet()) {
					if (!direction.equalsIgnoreCase("Q")) {
						System.out.println("\t\t" + direction + "," + location.getExits());
						locFile.writeUTF(direction);
						locFile.writeInt(location.getExits().get(direction));
					}
				}
			}
		}


	}

	static {
		//BINARY LOADOUT
		try (DataInputStream locFile = new DataInputStream(
				new BufferedInputStream(new FileInputStream("locations.dat")))) {
			boolean eof = false;
			while (!eof) {
				try {
					Map<String, Integer> exits       = new LinkedHashMap<>();
					int                  locID       = locFile.readInt();
					String               description = locFile.readUTF();
					int                  numExits    = locFile.readInt();
					System.out.println("Read location: " + locID + ":" + description);
					for (int i = 0; i < numExits; i++) {
						String direction   = locFile.readUTF();
						int    destination = locFile.readInt();
						exits.put(direction, destination);
						System.out.println("\t\t" + direction + "," + destination);
					}
					locations.put(locID, new Location(locID, description,
							exits));

				} catch (EOFException e) {
					eof = true;
				}
			}


		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		// Scanner scanner = null;
		// try {
		// 	scanner = new Scanner(new FileReader("locations.txt"));
		// 	scanner.useDelimiter(",");
		// 	while (scanner.hasNextLine()) {
		// 		int loc = scanner.nextInt();
		// 		scanner.skip(scanner.delimiter());
		// 		String description = scanner.nextLine();
		// 		System.out.println("imported: " + loc + description);
		// 		Map<String, Integer> tempExit = new HashMap<>();
		// 		locations.put(loc, new Location(loc, description, tempExit));
		// 	}
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// } finally {
		// 	if (scanner != null) {
		// 		scanner.close();
		// 	}
		// }
		//
		//
		// try {
		// 	scanner = new Scanner(new BufferedReader(new FileReader(
		// 			"directions.txt")));
		// 	scanner.useDelimiter(",");
		// 	while (scanner.hasNextLine()) {
		// 		// int loc = scanner.nextInt();
		// 		// scanner.skip(scanner.delimiter());
		// 		// String direction = scanner.next();
		// 		// scanner.skip(scanner.delimiter());
		// 		// String dest        = scanner.nextLine();
		// 		// int    destination = Integer.parseInt(dest);
		// 		String   input       = scanner.nextLine();
		// 		String[] data        = input.split(",");
		// 		int      loc         = Integer.parseInt(data[0]);
		// 		String   direction   = data[1];
		// 		int      destination = Integer.parseInt(data[2]);
		//
		// 		System.out.println(loc + "," + direction + "," + destination);
		// 		Location location = locations.get(loc);
		// 		location.addExit(direction, destination);
		//
		//
		// 	}
		//
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// } finally {
		// 	if (scanner != null) scanner.close();
		// }

		// Map<String, Integer> tmpExits = new HashMap<String, Integer>();
		// locations.put(0, new Location(0, "Te fuiste", tmpExits));
		//
		// tmpExits = new HashMap<>();
		// tmpExits.put("W", 2);
		// tmpExits.put("E", 3);
		// tmpExits.put("S", 4);
		// tmpExits.put("N", 5);
		// locations.put(1, new Location(1, "You are sitting in front of a " +
		// 		"computer", tmpExits));
		//
		// tmpExits = new HashMap<>();
		// tmpExits.put("N", 5);
		// locations.put(2, new Location(2, "te juiste lejos ameo", tmpExits));
		//
		// tmpExits = new HashMap<>();
		// tmpExits.put("W", 1);
		// tmpExits.put("Q", 0);
		// locations.put(3, new Location(3, "Encarando para Burzaco City",
		// 		tmpExits));
		//
		// tmpExits = new HashMap<>();
		// tmpExits.put("N", 1);
		// tmpExits.put("W", 2);
		// locations.put(4, new Location(4, "Estas yendo a Constitucion, " +
		// 		"cuidado" +
		// 		" " +
		// 		"con la billetera.", tmpExits));
		//
		// tmpExits.put("S", 1);
		// tmpExits.put("W", 2);
		// locations.put(5, new Location(5, "Entrando a Chetoslovakia.",
		// 		tmpExits));
		//
	}

	@Override
	public int size() {
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {
		return locations.get(key);
	}

	@Nullable
	@Override
	public Location put(Integer key, Location value) {
		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {
		return locations.remove(key);
	}

	@Override
	public void putAll(@NotNull Map<? extends Integer, ? extends Location> m) {

	}

	@Override
	public void clear() {
		locations.clear();
	}

	@NotNull
	@Override
	public Set<Integer> keySet() {
		return locations.keySet();
	}

	@NotNull
	@Override
	public Collection<Location> values() {
		return locations.values();
	}

	@NotNull
	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		return locations.entrySet();
	}
}
