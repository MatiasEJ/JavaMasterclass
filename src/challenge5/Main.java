package challenge5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 4, 3, 2, 1 };
		System.out.println("lo numerito : " + Arrays.toString(nums));

		reverse(nums);

	}

	public static void getIntegers(int[] numeros) {
		System.out.printf("-----INSERTE NUMEROS-----\n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("numero[%d]: ", i);
			int valor = input.nextInt();
			numeros[i] += valor;
		}
		System.out.printf("-------\n");
	}

	public static void printArray(int[] nombreArray) {
		for (int i = 0; i < nombreArray.length; i++) {
			System.out.printf("numero[%d]: %d\n", i, nombreArray[i]);
		}
		System.out.printf("-------\n");
	}

	public static void reverse(int[] array) {
		int mitad = array.length / 2;
		int maxIndex = array.length - 1;
		int[] newArray = new int[array.length];

		for (int i = 0; i < mitad; i++) {
			int val = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = val;

		}

		System.out.println("lo numerito 2: " + Arrays.toString(array));

	}

}
