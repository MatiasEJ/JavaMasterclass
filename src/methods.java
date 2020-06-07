import java.util.Scanner;

/****
 * JAVA BASES. Cap 26.
 * Constructors +
 * 
 ****/

public class methods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two additional methods
		// 1. To allow the customer to deposit funds (this should increment the balance field).
		// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
		// but not allow the withdrawal to complete if their are insufficient funds.
		

//		Account nuevaCuenta = new Account("001", 500, "bob", "email@gmail","12345");
//		
//		System.out.println(nuevaCuenta.getAccNumber());
//		System.out.println(nuevaCuenta.getBalance());		
//		
//		nuevaCuenta.withDraw(50);
//		nuevaCuenta.depositar(50);
//		
//		VipCustomer juan = new VipCustomer();
//		VipCustomer diego = new VipCustomer("Diego", 5000);
//		VipCustomer carlo = new VipCustomer("Carlo", 50000, "carlo@gmail.com");
//		
//		System.out.printf("Nombre: %s, Email: %s, CreditoMax: %d \n", juan.getName(), juan.getEmail(),juan.getCreditLimit());
//		System.out.printf("Nombre: %s, Email: %s, CreditoMax: %d \n", diego.getName(), diego.getEmail(),diego.getCreditLimit());
//		System.out.printf("Nombre: %s, Email: %s, CreditoMax: %d \n", carlo.getName(), carlo.getEmail(),carlo.getCreditLimit());
//		
		Animal animal = new Animal(1, 1, 5, 5, "Animal");
		
		Dog dog = new Dog(8, 20, "wat", 4, 1, 1, 1, "juan");
		
		dog.run();
		
		Fish nemo = new Fish(1, 1, 1, 1, "wat", 1, 1, 1);
		nemo.move("walk");
		

		
		
		
		
		
	}

}
