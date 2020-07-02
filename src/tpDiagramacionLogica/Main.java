package tpDiagramacionLogica;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		//EJERCICIO 1
//		String materias[] = { "lengua", "matematica", "" };
//		System.out.printf("--EJERCICIO 1---\n");
//		promedios(materias);
////		
////		//EJERCICIO 2
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
		System.out.printf("el MCM= %d", minComunMulti(numA, numB));
	}

	// 1. Realizar un algoritmo que me permita ingresar las notas que saqué durante
	// la cursada en todas las materias del primer cuatrimestre de 2020 del ifts16 y
	// me devuelva
	// el promedio de las mismas.

	public static void promedios(String[] materias) {
		int sumaNota = 0, cantNotas = 0;
		for (int i = 0; i < materias.length; i++) { // cantidad de materias
			System.out.printf("Materia(la carga finaliza con -1): %s \n", materias[i]);
			System.out.printf("Nota: ");
			int notaSig = scanner.nextInt();
			while (notaSig > 0) { // Pido notas hasta ingresar numero negativo
				cantNotas++;
				sumaNota += notaSig;
				System.out.printf("Nota: ");
				notaSig = scanner.nextInt();
			}
			double promedio = sumaNota / cantNotas;
			System.out.printf("Materia: %s, Promedio: %.2f \n", materias[i], promedio);
		}

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
		int a = numeroA, b = numeroB;
		int aux;// Para no perder b
		int auxA = numeroA;
		// MaxComunDivisor//en este bloque se calcula el maximo comun divisor
		int mcd;
		while (numeroB != 0) {
			aux = numeroB;
			numeroB = numeroA % numeroB; // EL RESTO DE LA DIVISION
			auxA = aux; // A pasa a tener el valor de b (que estaba guardado en aux)
		}
		mcd = auxA;
		// MINIMO COMUN MULTIPLO
		// MCM(a, b) = (a * b) / MCD(a, b)
		int mcm = ((a * b) / mcd);
		return mcm;
	}

}
