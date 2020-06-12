package challengeArrayList;

import java.util.Scanner;

public class Main {

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the arrayList of Contacts
// The mobile phone class has The functionality listed above.
// Add a menu of options that are available.
// Options: Quit, print list of Contcts, add new contact, update existing Contact, remove contactand search/find contact.
// When adding or updating be sure to check if the concta already exist (use name)
// be sure not to expose the inner workings of the arraylist to mobilePhone 
// no ints, no geti etc
// mobilephone should do everythin tiwh contact objects only
//
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0039 330 4484");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		startPhone();
		printActions();
		while (!quit) {
			System.out.println("enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				mobilePhone.printContacts();
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
			default:
				break;
			}
		}

	}

	private static void startPhone() {
		System.out.println("STARTING PHONE");
	}

	private static void printActions() {

		System.out.printf("\n Press: ");
		System.out.printf("\n 0 - to choice options ");
		System.out.printf("\n 1 - Print Contact");
		System.out.printf("\n 2 - Add ");
		System.out.printf("\n 3 - Modify ");
		System.out.printf("\n 4 - Remove ");
		System.out.printf("\n 5 - Search ");
		System.out.printf("\n 6 - Quit ");

	}

}
