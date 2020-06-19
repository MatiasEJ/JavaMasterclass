package linkedLists;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("tim", 54.96);
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setBalance(12.25);
		System.out.printf("Balance of customer: %s, balance: %.2f", customer.getName(), customer.getBalance());
	}

}
