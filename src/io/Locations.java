package io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
	private static Map<Integer, Location> locations = new HashMap<>();

	public static void main(String[] args) throws IOException {
		try (ObjectOutputStream locFile =
				     new ObjectOutputStream(
						     new BufferedOutputStream(
								     new FileOutputStream("locations.dat"))
				     )) {
			for (Location location : locations.values()){
				locFile.writeObject(location);
			}
		}
	}

	static {
		//BINARY LOADOUT
		try (ObjectInputStream locFile = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("locations.dat")))) {
			boolean eof = false;
			while (!eof) {
				try {
					Location location = (Location) locFile.readObject();
					System.out.println("Read Location"+location.getLocationId());
					locations.put(location.getLocationId(),location);
				} catch (InvalidClassException invalidClassException){
					System.out.println("Invalid class exception "+ invalidClassException );
				}catch (EOFException e) {
					eof = true;
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}


		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
