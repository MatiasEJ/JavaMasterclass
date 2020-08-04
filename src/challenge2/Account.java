package challenge2; /**
 * 
 */

/**
 * @author keta
 * // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
 */
public class Account {
	private String accNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
	public Account() {
		this("0000", 2.5, "default Name", "default Email", "default phone");
		System.out.println("Empty constructor");
	}
	
	public Account(String accNumber, double balance, String customerName, String customerEmail, String customerPhone) {
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
}
	
	public Account(String customerName, String customerEmail, String customerPhone) {
		this("wat", 3, "watwat", "watwat2", "watwat3");
	}

	public void depositar(double platita) {
		this.balance += platita;
		System.out.println("Deposito: "+platita+" me queda: "+this.balance);
	}
	
	public void withDraw(double withDraw) {
		if((this.balance - withDraw)<0) {
			System.out.println("No podes retirar ameo");
		}else {
			this.balance -= withDraw;
			System.out.println("retiro: "+withDraw+" me queda: "+this.balance);
		}
	}
	
	
	public String getAccNumber() {
		return this.accNumber;
	}
	
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerEmail() {
		return this.customerEmail;
	}
	
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return this.customerPhone;
	}
	
	public void setCustomerPhone(String Phone) {
		this.customerPhone = customerPhone;
	}
	
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
	
	
	
}
