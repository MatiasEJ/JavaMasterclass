package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Player player = new Player();
//		
//		player.name = "tim";
//		player.health = 100;
//		player.weapon = "axe";
//		int damage = 10;	
//		
//		player.loseHealth(damage);
//	

		EnhacedPlayer player = new EnhacedPlayer("juan", 100, "Sword");
		player.loseHealth(300);
		System.out.println("remaining Health = " + player.getHealth());

	}

}
