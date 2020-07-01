package tpDiagramacionLogica;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//EJERCICIO 1
//		System.out.printf("--EJERCICIO 1---\n");
//		
//		System.out.printf("Materia: ");
//		String materia = scanner.next();
//		promedios(materia);
//		
//		//EJERCICIO 2
//		System.out.printf("--EJERCICIO 2---\n");
//		for (int i = 2; i < 100; i++) {
//			if (primo(i) > 0)
//				System.out.printf("%d, ", primo(i));
//			
//		}
//		
		// EJERCICIO 3
		System.out.printf("--EJERCICIO 3---\n");
		System.out.printf("Numero A: ");
		int numA = scanner.nextInt();
		System.out.printf("Numero B: ");
		int numB = scanner.nextInt();
		System.out.printf("MinCM de %d y %d = %d \n", numA, numB, minComunMulti(numA, numB));

	}

	// 1. Realizar un algoritmo que me permita ingresar las notas que saqué durante
	// la cursada en
	// todas las materias del primer cuatrimestre de 2020 del ifts16 y me devuelva
	// el promedio de
	// las mismas.

	public static void promedios(String materia) {
		int sumaNota = 0, cantNotas = 0;
		System.out.printf("Materia: %s \n", materia);
		System.out.printf("Nota: ");
		int notaSig = scanner.nextInt();
		while (notaSig > 0) {
			cantNotas++;
			sumaNota += notaSig;
			System.out.printf("Nota: ");
			notaSig = scanner.nextInt();
		}
		double promedio = sumaNota / cantNotas;

		System.out.printf("Materia: %s, Promedio: %.2f", materia, promedio);

	}

	// 2. Realizar una función que sea capaz de identificar números primos. Luego
	// llamarla en un
	// ciclo de repetición del 2 al 1000 para que identifique los mismos y los
	// imprima por consola.
	public static int primo(int numero) {
		if ((numero % 2) == 0 && numero != 2) {
			return 0;
		}
		for (int i = 2; i < Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return 0;
			}
		}
		return numero;
	}

	// 3. Realizar una función que calcule el “mínimo común múltiplo” entre dos
	// números pasados
	// por parámetros.
	public static int minComunMulti(int numeroA, int numeroB) {

//		MCM(a, b) = (a * b) / MCD(a, b)
		return (numeroA * numeroB) / mcd(numeroA, numeroB);

	}

	public static int mcd(int a, int b) {
		int aux;// Para no perder b
		while (b != 0) {
			aux = b;
			b = a % b; // EL RESTO DE LA DIVISION
			a = aux; // A pasa a tener el valor de b (que estaba guardado en aux)
		}
		return a;
	}

}
