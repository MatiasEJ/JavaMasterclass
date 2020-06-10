package challenge3;

public class Burger {
	private Bread bread;
	private Meat meat;
	private int basePrice = 20;

	public Burger(Bread bread, Meat meat) {
		this.bread = bread;
		this.meat = meat;
		this.basePrice = basePrice + bread.getPrice();
	}

	public Burger(Bread bread, Meat meat, int topingsTotal) {
		this.bread = bread;
		this.meat = meat;
		this.basePrice = basePrice + bread.getPrice() + topingsTotal;
	}

	public int precioBurger() {

		System.out.printf("El precio del pan: %d de la Burga es: %d \n", this.bread.getPrice(), basePrice);
		return basePrice;
	}

}
