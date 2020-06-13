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
				printActions();
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchContact();
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

	private static void addContact() {
		System.out.println("Añadir un nuevo contacto: ");
		String name = scanner.nextLine();
		System.out.println("Añadir numero de contacto: ");
		String number = scanner.nextLine();
		Contact newContact = Contact.createContact(name, number);
		if (mobilePhone.storeContact(newContact)) {
			System.out.println("Contacto Creado con exito");

		} else {
			System.out.println("No se pudo crear el contacto");

		}

	}

	private static void updateContact() {
		System.out.println("Modificar contacto: ");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if (existingContact == null) {
			System.out.println("No se encontro el usuario");
			return;
		} else {
			System.out.println("Usuario encontrado, introduzca nombre: ");
			System.out.println("Modificar contacto: ");
			String newName = scanner.nextLine();
			System.out.println("Modificar contacto: ");
			String newPhone = scanner.nextLine();
			Contact newContact = Contact.createContact(newName, newPhone);
			if (mobilePhone.updateContact(existingContact, newContact)) {
				System.out.println("Updateado correcto");
			} else {
				System.out.println("No se pudo actualizar");
			}

		}
		;

	}

	private static void removeContact() {
		System.out.println("Contacto a eliminar: ");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if (existingContact == null) {
			System.out.println("No se encontro el usuario");
			return;
		} else {
			mobilePhone.removeContact(existingContact);
			System.out.println("Usuario encontrado y eliminado. ");

		}
		;

	}

	private static void searchContact() {
		System.out.println("Modificar contacto: ");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if (existingContact == null) {
			System.out.println("No se encontro el usuario");
			return;
		} else {
			System.out.println(
					"Usuario encontrado: " + existingContact.getName() + " numero: " + existingContact.getPhone());

		}
		;

	}

}
