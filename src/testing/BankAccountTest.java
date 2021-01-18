package testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
	private BankAccount account;
	private static int count = 0;

	@BeforeAll
	public static void beforeClass(){
		System.out.println("this executes before any test: "+count++);
	}
	@BeforeEach
	public void setup(){
		account = new BankAccount("tim", "buck", 1000, BankAccount.CHECKING);
		System.out.println("Running a test...");
	}






	@Test
	void deposit() {
		double      balance = account.deposit(200, true);
		assertEquals(1200, balance, 0);
	}

	@Test()
	void withdraw_notBranch() {
		try {
		account.withdraw(600,false);
		}catch (IllegalArgumentException e){
		}
	}

	@Test
	void withdraw_branch() {
		double balance = account.withdraw(600,true);
		assertEquals(400.00,balance,0);
	}

	@Test
	void getBalance_withdraw() {
		account.withdraw(200, true);
		assertEquals(800, account.getBalance(), 0);

	}

	@Test
	void getBalance_deposit() {
		account.deposit(200, true);
		assertEquals(1200, account.getBalance(), 0);
	}

	@Test
	public void isChecking_true() {
		assertTrue(account.isChecking(),"its not checking");
	}

	@AfterEach
	public void afterClass(){
		System.out.println("(por cada test)count: "+ count++);
	}

	@AfterAll
	public static void afterAllTest(){
		System.out.println("this executes in the end: "+count++);
	}

}