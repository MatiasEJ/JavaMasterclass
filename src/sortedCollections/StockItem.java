package sortedCollections;

import org.jetbrains.annotations.NotNull;

public class StockItem implements Comparable<StockItem> {
	private final String name;
	private double price;
	private int quantityStock;

	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityStock = 0;
	}

	public void setPrice(double price) {
		if(price > 0.0){
			this.price = price;
		}

	}

	public void adjustStrock(int quantity){
		int newQuantity = this.quantityStock + quantity;
		if (newQuantity>0){
			this.quantityStock = newQuantity;
		}
	}


	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	@Override
	public int compareTo(@NotNull StockItem o) {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering StockImte.equals");
		if(obj == this) return true;

		if ( obj == null || obj.getClass() != this.getClass()) return false;

		String objName = ((StockItem) obj).getName();
		return this.name.equals(objName);


	}




	




}
