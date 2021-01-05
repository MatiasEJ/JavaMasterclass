package tpsProyectoProgramador.bank;

public class MainBank {
	public static void main(String[] args) {
// create an bank account
		BankAccount account1 = new BankAccount("99786754", "Gayle Forcewind");
		BankAccount account2 = new BankAccount("99887776", "Stan Dandy-Liver");
// make a deposit in primer cuenta
		account1.deposit(1000);
// make a deposit in segunda cuenta
		account2.deposit(2000);
// set the interst rate

	}
}
