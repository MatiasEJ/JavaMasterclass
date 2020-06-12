package arraysLists;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryList(String item) {
		groceryList.add(item);

	}

	public void printGroceryList() {
		System.out.printf("you have %d items.", groceryList.size());
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.printf("item %s: %s", i, groceryList.get(i));
		}
	}

	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.printf("grocery item %d, has been modified", position);
	}

	public void removeGroceryList(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}

	public String findItem(String searchItem) {
		boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if (position >= 0) {
			return groceryList.get(position);
		}

		return null;
	}

}
