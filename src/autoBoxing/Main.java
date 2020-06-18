package autoBoxing;

import java.util.ArrayList;

public class Main {
	/**
	 * Create a simple banking application there should be a bank class it should
	 * have an ArrayList of Branches each branch shoul have and ArrayList of
	 * Branches Each Branch should have an arrayList of Customers The customer class
	 * should have an arraylist of Doubles(transactions) Customer: name, and the
	 * arrayList of doubles Branch: Need to be able to add a new customer and
	 * initial transaction amount Also need to add addiotional transactions for that
	 * customer/branch bank: add a new branch add a customer to that branch with the
	 * inital transaction add a transaction for an existing customer for that
	 * brancha show a list of customers for a particular branch and optionally a
	 * list of their transactions Demostration of autoboxing and unboxing in your
	 * code Transactions add data validations check if exist
	 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> myIntArray = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			myIntArray.add(Integer.valueOf(i + 1));
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("[%d]=%d \n", i, myIntArray.get(i));
		}

	}

}
