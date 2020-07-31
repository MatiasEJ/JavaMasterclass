package challengeInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/**
	 * Create a simple interface that interface allows an object to be saved to some
	 * sort of storage medium(arrayList) The exact type of medium is not know to the
	 * interface(nor the classes that implement it) The interface will just specify
	 * two methods, one to return an arrayList of values to be saved and the other
	 * to populate the objects fields from an arraylist (parameter)
	 * 
	 * create a few sample classes that implement your saveable interface (we've
	 * used the idea of a game
	 * 
	 * override tostring() method for each of your classes so that they can be
	 * easily printed
	 * 
	 * in the main write a methos that takes an object that implements the interface
	 * as the parameter and saves the values calls the methos defined in the
	 * interface we haven covered io yet so your methos should just print the values
	 * to the screen also in the main classs write a method that restores te values
	 * to a saveable object calls the method from the interface for populating
	 * fields
	 * 
	 * again we are not goint to use jave file io/O instead use the readvalues()
	 * mehotd below to simulate getting values from a file this allows you to type
	 * as manyy values as your class requires and return an arrayList there is a
	 * whole javai/o section later in the course
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monster blarg = new Monster("Blarg", 100, 12);
		System.out.println(blarg.toString());
		saveObject(blarg);

		Playa juan = new Playa("Juan", "noob", 200);
		System.out.println(juan.toString());
		saveObject(juan);

	}

	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<String>();

		try (Scanner scanner = new Scanner(System.in)) {
			boolean quit = false;
			int index = 0;
			System.out.printf("Choose \n 1 to enter string\n 0 to quit");

			while (!quit) {
				System.out.printf("Choose an option:");
				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 0:
					quit = true;
					break;
				case 1:
					System.out.printf("Enter a string");
					String stringInput = scanner.nextLine();
					values.add(index, stringInput);
					index++;
					break;
				}

			}
		}
		return values;
	}

	public static void saveObject(SaveObject objectToSave) {
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.printf("Saving: %s to storage\n", objectToSave.write().get(i));

		}
	}

	public static void loadObject(SaveObject objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.Read(values);
	}

}
