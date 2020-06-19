package autoBoxing;

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

		Bank bank = new Bank("HSBC");

		bank.addBranch("zonasur");
		bank.addCustomer("zonasur", "Diego", 100);
		bank.addCustomer("zonasur", "Juan", 200);
		bank.addCustomer("zonasur", "Marko", 300);

		bank.addBranch("zona norte");
		bank.addCustomer("zona norte", "Diegol", 400);
		bank.addCustomer("zona norte", "Juanl", 500);
		bank.addCustomer("zona norte", "Markol", 600);

//		bank.listCustomers("zonasur", true);

		bank.addCustomerTransaction("zonasur", "Diego", 300);
		bank.listCustomers("zonasur", true);
	}

}
