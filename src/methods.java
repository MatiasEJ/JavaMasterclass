import java.util.Scanner;

/****
 * JAVA BASES. Cap 26.
 ****/

public class methods {

	// You will want to create various code in the Main class (the one created by
	// IntelliJ) to
	// confirm your code is working.
	// Add some System.out.println's in the two methods above as well.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two additional methods
		// 1. To allow the customer to deposit funds (this should increment the balance field).
		// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
		// but not allow the withdrawal to complete if their are insufficient funds.
		Scanner input = new Scanner(System.in);
		Scanner codigo = new Scanner(System.in);

		Account nuevaCuenta = new Account("001", 500, "bob", "email@gmail","12345");
		
		System.out.println(nuevaCuenta.getAccNumber());
		System.out.println(nuevaCuenta.getBalance());		
		
		nuevaCuenta.withDraw(50);
		nuevaCuenta.depositar(50);
		
		input.close();
	}

}
