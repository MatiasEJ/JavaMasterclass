package autoBoxing;

import java.util.ArrayList;

public class Customer {
	ArrayList<Double> transactions;
	private String name;

	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}

	public void addTransaction(Double amount) {
		this.transactions.add(amount);
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public String getName() {
		return name;
	}

}
