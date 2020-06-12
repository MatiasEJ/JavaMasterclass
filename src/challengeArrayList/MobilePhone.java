package challengeArrayList;

import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContact;

	public MobilePhone(String myNumber, ArrayList<Contact> myContact) {
		this.myNumber = myNumber;
		this.myContact = new ArrayList<Contact>();
	}

	public boolean storeContact(Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact already on file");
			return false;
		}
		myContact.add(contact);
		return true;

	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPos = findContact(oldContact);
		if (foundPos < 0) {
			System.out.println("No contact found");
			return false;
		}
		this.myContact.set(foundPos, newContact);
		System.out.println("modified contact! >ASDASDASD");
		return true;
	}

	public boolean removeContact(Contact contact) {
		int foundPos = findContact(contact);
		if (foundPos < 0) {
			System.out.println("No contact found");
			return false;
		}
		this.myContact.remove(foundPos);
		System.out.println("Remove contact! >ASDASDASD");
		return true;
	}

	private int findContact(Contact contact) {
		return this.myContact.indexOf(contact);
	}

	private int findContact(String contactName) {
		for (int i = 0; i < this.myContact.size(); i++) {
			Contact contact = this.myContact.get(i);
			if (contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}

	public String queryContact(Contact contact) {
		if (findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}

	public void printContacts() {
		System.out.println("CONTACTS:\n");
		for (int i = 0; i < this.myContact.size(); i++) {
			System.out.printf("Contact name: %s, phone: %s", this.myContact.get(i).getName(),
					this.myContact.get(i).getPhone());
		}
	}

}
