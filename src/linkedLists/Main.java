package linkedLists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("tim", 54.96);
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setBalance(12.25);
//		System.out.printf("Balance of customer: %s, balance: %.2f", customer.getName(), customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(4);

		for (int i = 0; i < intList.size(); i++) {
			System.out.printf("[%s]: %s\n", i, intList.get(i));
		}

		intList.add(1, 2);
		System.out.printf("------------\n");
		for (int i = 0; i < intList.size(); i++) {
			System.out.printf("[%s]: %s\n", i, intList.get(i));
		}

	}

}
