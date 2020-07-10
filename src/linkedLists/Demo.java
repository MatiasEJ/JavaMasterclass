package linkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<>();
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Calzada");
		addInOrder(placesToVisit, "Adrogue");
		addInOrder(placesToVisit, "Burzaco");
		addInOrder(placesToVisit, "Eugorda");

//		Publicado por Alvaro (1 intervención) el 12/12/2013 01:04:19
//		Para escribir super indices y sub indices en java te recomiendo que aunque sea un poco rollo uses Unicode:
//		Superindice 1: \u00B9
//		Superindice 2: \u00B2
//		Superindice 3: \u00B3
//		Y desde el 4 al 9 (0 incluido) es: \\u207x (x es igual al número que quieras. ejemplo: superindice 6: \u2076)
//
//		Espero que te haya servido

		printList(placesToVisit);
		visit(placesToVisit);

	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();

		while (i.hasNext()) {
			System.out.printf("[wat]: %s\u00B9 \n", i.next());
		}
		System.out.printf("\n--===========--\n");

	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringIterator = linkedList.listIterator();

		while (stringIterator.hasNext()) {
			int comparison = stringIterator.next().compareTo(newCity);
			if (comparison == 0) {
				// equal
				System.out.printf("%s ya esta", newCity);
				return false;
			} else if (comparison > 0) {
				// YA NOS MOVIMOS
				stringIterator.previous();
				stringIterator.add(newCity);
				return true;
			} else if (comparison < 0) {
				// move on the next city
			}
		}
		stringIterator.add(newCity);
		return true;
	}

	private static void visit(LinkedList<String> cities) {
		Scanner scanner = new Scanner(System.in);
		boolean goingForward = true;
		boolean quit = false;
		ListIterator<String> listIterator = cities.listIterator();
		if (cities.isEmpty()) {
			System.out.printf("no cities in the itenerary");
			return;
		} else {
			System.out.printf("now visiting %s", listIterator.next());
			printMenu();
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.hasNextLine();
			switch (action) {
			case 0:
				System.out.printf("holiday vacation over");
				quit = true;
				break;
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;

				}
				if (listIterator.hasNext()) {
					System.out.printf("Now visiting: %s", listIterator.next());

				} else {
					System.out.printf("End of list");
					goingForward = true;
				}

				break;

			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;

				}
				if (listIterator.hasPrevious()) {
					System.out.printf("Now visiting: %s", listIterator.previous());
				} else {
					System.out.printf("Start of list");
					goingForward = false;
				}
				break;
			case 3:
				printMenu();
				break;

			}
		}

	}

	private static void printMenu() {
		System.out.printf("OPTIONS \n ");
		System.out.printf("0 - quit \n ");
		System.out.printf("1 - next \n ");
		System.out.printf("2 - previous\n ");

	}

}
