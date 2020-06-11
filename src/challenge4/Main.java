package challenge4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantNumeros = 5, valor;
		int[] numeros = new int[cantNumeros];

		getIntegers(numeros);
		printArray(numeros);
		sortInteger(numeros);

	}

	public static void getIntegers(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("numero[%d]: ", i + 1);
			int valor = input.nextInt();
			numeros[i] += valor;
		}
		System.out.printf("-------\n");
	}

	public static void printArray(int[] nombreArray) {
		for (int i = 0; i < nombreArray.length; i++) {
			System.out.printf("numero[%d]: %d\n", i + 1, nombreArray[i]);
		}
		System.out.printf("-------\n");
	}

	public static void sortInteger(int[] nombreArray) {
		int aux;
		int[] nuevoArray = Arrays.copyOf(nombreArray, nombreArray.length);

//		for (int i = 0; i < nombreArray.length; i++) {
//			nuevoArray[i] = nombreArray[i];
//		}

		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < nuevoArray.length - 1; i++) {
				if (nuevoArray[i] < nuevoArray[i + 1]) {
					temp = nuevoArray[i];
					nuevoArray[i] = nuevoArray[i + 1];
					nuevoArray[i + 1] = temp;
					flag = true;

				}
			}
		}

		printArray(nuevoArray);

	}

}
