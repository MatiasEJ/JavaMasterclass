package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		try{
			int result = divide();
			System.out.println("Result: "+result);
		}catch (ArithmeticException | NoSuchElementException e){
			System.out.println(e.toString());
			System.out.println("Unable to perform Division");
		}
	}

	private static int divide(){
		int x, y;
		x = getInt();
		y = getInt();
		System.out.println("x: "+x+" y: "+y);
		return x/y;
	}

	private static int getInt(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an interger: ");
		while(true){
			try {
				return scanner.nextInt();
			}catch (InputMismatchException e){
				scanner.nextLine();
				System.out.println("numbers 0 to 9");
			}
		}
	}



}
