package innerclasses;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {

		class ClickListener implements Button.OnClickListener {
			public ClickListener() {
				System.out.println("i've been attached");
			}

			@Override
			public void onClick(String title) {
				// TODO Auto-generated method stub
				System.out.println(title + " was clicked");

			}

		}
		btnPrint.setOnClickListener(new ClickListener());
		listen();

		// TODO Auto-generated method stub
//		Gearbox mcLaren = new Gearbox(6);
//
//		mcLaren.addGear(1, 5.3);
//		mcLaren.addGear(2, 19.4);
//		mcLaren.addGear(3, 15);
//
//		mcLaren.operatedClutch(true);
//		mcLaren.changeGear(1);
//		mcLaren.operatedClutch(false);
//		System.out.println(mcLaren.wheelSpeed(1000));
//		mcLaren.changeGear(2);
//		System.out.println(mcLaren.wheelSpeed(3000));

	}

	private static void listen() {
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.hasNextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				btnPrint.onClick();
			}

		}
	}

}
