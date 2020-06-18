package autoBoxing;

import java.util.ArrayList;

public class Customer {
	ArrayList<Double> transactions = new ArrayList<Double>();
	private String name;

	public Customer(ArrayList<Double> transactions, String name) {
		this.transactions = transactions;
		this.name = name;
	}

	public void addTransaction(int value) {
		transactions.add(Double.valueOf(value));
		// for (int i = 0; i < 10; i++) {
		// System.out.printf("[%d]=%d \n", i, myIntArray.get(i));
		// }
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
