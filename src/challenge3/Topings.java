package challenge3;

public class Topings {
	private int tomate = 0;
	private int egg=0;
	private int cebolla=0;
	private int carrot=0;
	
	public Topings(int tomate, int egg, int cebolla, int carrot) {
		this.tomate = 5 * tomate;
		this.egg = 10 * egg;
		this.cebolla = 2 * cebolla;
		this.carrot = 1 * carrot;
	}
	
	public int topingsTotal() {
		return this.tomate+this.egg+this.cebolla+this.carrot;
	}
	
	
	
	
}
