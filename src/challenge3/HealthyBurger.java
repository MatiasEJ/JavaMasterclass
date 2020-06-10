package challenge3;

public class HealthyBurger extends Burger {
	// a) Healthy burger (on a brown rye bread roll), plus two addition items that
	// can be added.
	// The healthy burger can have 6 items (Additions) in total.
	// hint: you probably want to process the two additional items in this new class
	// (subclass of Hamburger),
	// not the base class (Hamburger), since the two additions are only appropriate
	// for this new class
	// (in other words new burger type).

	private int bacon;
	private int champignones;
	private int healthyPrice;

	public HealthyBurger(Bread bread, Meat meat, int totalTopings, int bacon, int champignones) {
		super(bread, meat);
		this.bacon = 30 * bacon;
		this.champignones = 20 * champignones;
		this.healthyPrice = precioBurger() + totalTopings + this.bacon + this.champignones;
	}

	public void precioHealthy() {
		System.out.printf("El precio de la healthy burga es: %d", healthyPrice);
	}

	// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra
	// additions are allowed.
	// hint: You have to find a way to automatically add these new additions at the
	// time the deluxe burger
	// object is created, and then prevent other additions being made.
}
