package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountParametrized {
	public BankAccount account;
	@Parameterized.Parameter
	private double amount;
	@Parameterized.Parameter(1)
	private boolean branch;
	@Parameterized.Parameter(2)
	private double expected;

	public BankAccountParametrized() {
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testConditions(){
		return Arrays.asList(new Object[][]{
				{100.00,true,1100.00},
				{200.00,true,1200.00},
				{325.14,true,1325.14},
				{489.33,true,1489.33},
				{1000.00,true,2000.00}
		});
	}

	@BeforeEach
	public void setup() {
		account = new BankAccount("tim", "buck", 1000, BankAccount.CHECKING);
		System.out.println("Running a test...");
	}


	@ParameterizedTest
	@MethodSource("testConditions")
	void deposit(double amount,boolean branch,double expected) {
		account.deposit(amount, branch);

		assertEquals(expected, account.getBalance(), .01);
	}
}
