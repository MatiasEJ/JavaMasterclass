package tpsProyectoProgramador.bank;

public class BankAccount
{
	private String accountNumber;
	private String accountName;
	protected double balance;

	public BankAccount(String numberIn, String nameIn) 
	{
		accountNumber = numberIn;
		accountName = nameIn;
		balance = 0;
	}

	public String getAccountName() 
	{
		return accountName;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void deposit(double amountIn) 
	{
		balance = balance + amountIn;
	}
// (a) Adapte el método withdrawMoney ( retiro de dinero) para que distinga las dos razones por las cuales el método
// podría fallar: a saber, que no hay una cuenta con el número de cuenta dado o que no hay suficiente dinero en la
// cuenta para hacer un retiro.
// 	Un método booleano ya no sería suficiente ya que hay más de una posibilidad.
// 	Una solución sería que el método devuelva un número entero: tal vez 1 para el éxito,
// 	-1 para indicar que el método falló porque no había dicho número de cuenta y -2 para indicar que falló
// 	porque no había fondos suficientes.
	public int withdraw(double amountIn)
	{
		if (amountIn > balance) 
		{
			return -1; // no withdrawal was made
		} 
		else 
		{
			balance = balance - amountIn;
			return 1; // money was withdrawn successfully
		}
	}
}
