package challenge3;

public class Bread {
	private int breadCode;
	private int price = 10;

	public Bread(int breadCode) {
		if (breadCode == 1) {
			this.breadCode = 1;
			this.price = 25;
		} else if (breadCode == 0) {
			this.breadCode = 0;
			this.price = 20;
		}

	}

	public int getBreadCode() {
		return breadCode;
	}

	public int getPrice() {
		return price;
	}

}
