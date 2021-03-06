package autoBoxing;

import java.util.ArrayList;

public class Branch {
	private String name;
	ArrayList<Customer> customers;

	public Branch(String branchName) {
		this.name = branchName;
		this.customers = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}

	public boolean newCustomer(String customerName, double initialAmount) {
		if (findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName, initialAmount));
		}
		return false;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean addCustomerTransaction(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;

	}

	private Customer findCustomer(String customerName) {
		for (int i = 0; i < this.customers.size(); i++) {
			Customer checkCustomer = this.customers.get(i);

			if (checkCustomer.getName().equals(customerName)) {
				return checkCustomer;
			}
		}
		return null;
	}

}
