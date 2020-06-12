package arraysLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean quit = false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println("enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;
			case 7:
				processArrayList();
			default:
				break;
			}

		}

	}

	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(groceryList.getGroceryList());

		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

		String[] myArray = new String[groceryList.getGroceryList().size()];

		myArray = groceryList.getGroceryList().toArray(myArray);

	}

	public static void printInstructions() {
		System.out.printf("\n Press: ");
		System.out.printf("\n 0 - to choice options ");
		System.out.printf("\n 1 - Print options");
		System.out.printf("\n 2 - Add ");
		System.out.printf("\n 3 - Modify ");
		System.out.printf("\n 4 - Remove ");
		System.out.printf("\n 5 - Search ");
		System.out.printf("\n 6 - Quit ");
	}

	public static void addItem() {
		System.out.printf("Enter item: ");
		groceryList.addGroceryList(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.printf("Enter item number: ");
		String itemNumber = scanner.nextLine();

		System.out.printf("Enter replace item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNumber, newItem);

	}

	public static void removeItem() {
		System.out.printf("Enter item: ");
		String itemNumber = scanner.nextLine();
		groceryList.removeGroceryItem(itemNumber);

	}

	public static void searchForItem() {
		System.out.printf("item to search for: ");
		String searchItem = scanner.nextLine();
		if (groceryList.onFile(searchItem)) {
			System.out.println("found " + searchItem);
		} else {
			System.out.println(searchItem + " is not in the list");
		}
	}

}
