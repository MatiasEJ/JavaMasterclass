package linkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Rafael Calzada");
		placesToVisit.add("Claypole");
		placesToVisit.add("Adrogue");
		placesToVisit.add("Eugorda");

		printList(placesToVisit);
		placesToVisit.add(0, "Coburza");
		printList(placesToVisit);
		placesToVisit.remove(4);
		printList(placesToVisit);

	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();

		while (i.hasNext()) {
			System.out.printf("[%s]: %s\n", Integer.parseInt(i), i.next());
		}
		System.out.printf("\n--===========--\n");

	}

}
