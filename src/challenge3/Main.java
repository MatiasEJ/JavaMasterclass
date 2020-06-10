/**
 * 
 */
package challenge3;

/**
 * @author keta
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread pan = new Bread(0);
		Meat carne = new Meat(1);
		Topings topings = new Topings(0, 0, 0, 0);
		int totalTopings = topings.topingsTotal();

		Burger paraAye = new Burger(pan, carne, totalTopings);

		HealthyBurger nuevaBurga = new HealthyBurger(pan, carne, totalTopings, 1, 1);
		nuevaBurga.precioHealthy();

	}

}
