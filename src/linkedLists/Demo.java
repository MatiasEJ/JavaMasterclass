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

//		Publicado por Alvaro (1 intervención) el 12/12/2013 01:04:19
//		Para escribir super indices y sub indices en java te recomiendo que aunque sea un poco rollo uses Unicode:
//		Superindice 1: \u00B9
//		Superindice 2: \u00B2
//		Superindice 3: \u00B3
//		Y desde el 4 al 9 (0 incluido) es: \\u207x (x es igual al número que quieras. ejemplo: superindice 6: \u2076)
//
//		Espero que te haya servido

		printList(placesToVisit);
		placesToVisit.add(0, "Coburza");
		printList(placesToVisit);
		placesToVisit.remove(4);
		printList(placesToVisit);

	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();

		while (i.hasNext()) {
			System.out.printf("[wat]: %s\u00B9\u00B6 \n", i.next());
		}
		System.out.printf("\n--===========--\n");

	}

}
