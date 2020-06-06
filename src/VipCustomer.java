/**
 * 
 */

/**
 * @author keta
 *	Create a new classs VipCustomer
 *	 It should have 3 fields, name, credit limit, and email address.
 * 1st constructor empty should call the constructor with 3 parametres with default values
 * 2nd constructor should pass on the values it recieves and add a default value for the 3rd
 * 3rd constructor should save all fields.
 * 
 * Create getters only for this using code generation as setters wont be needed
 * 
 * test and confirm
 * 
 */
public class VipCustomer {
	private String name;
	private int creditLimit;
	private String email;
	
	
	public VipCustomer() {
		this("nombre", 000, "email@email.email");
		System.out.println("Default Values");
	}
	
	public VipCustomer(String name, int creditLimit) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = "default value";
	}
	
	public VipCustomer(String name, int creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	

}
