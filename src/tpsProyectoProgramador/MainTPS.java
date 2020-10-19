package tpsProyectoProgramador;

import java.util.Scanner;

public class MainTPS {
	private final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double[] temperature;
		temperature = enterTemps(); // call new version of this method
		int opt = MenuOpt();

		while (opt!=5) {
			switch (opt) {
				case 1:
					displayTemps(temperature);
					break;
				case 2:
					wasHot(temperature);

					break;
				case 3:
					modificarTemp(temperature);
					break;
				case 4:
					if (semanaFresca(temperature)) {
						System.out.println("esta fue una semana fresca");

					} else {
						System.out.printf("Esta NO fue una semana fresca.");
					}
					break;

			}
			opt = MenuOpt();
		}
		displayTemps(temperature);
	}

	//
// method to enter temperatures returns an array
	static double[] enterTemps() {
// TEMPERATURAS DE TESTEO
//        Scanner keyboard = new Scanner(System.in);
		double[] temperatureOut = {9, 28, 6, 4, 6, 3, -123};
//        double[] temperatureOut = new double[7];
//        for (int i = 0; i < temperatureOut.length; i++)
//        {
//            System.out.println("enter max temperature for day " + (i+1));
//            temperatureOut[i] = keyboard.nextDouble();
//        }
		return temperatureOut;
	}

	static void displayTemps(double[] temperatureIn) {
		System.out.println();
		System.out.println("***TEMPERATURES ENTERED***");
		System.out.println();
		for (int i = 0; i < temperatureIn.length; i++) {
			System.out.println("day " + (i + 1) + " " + temperatureIn[i]);
		}
	}


	//    //E8----
//    //Vuelva a mirar el programa TemperatureReadings2, que lee y muestra una serie de lecturas de temperatura.
//    // Diseña y escribe el código para un método adicional, wasHot, que muestre todos los días que se registraron
//    //temperaturas de 25 ° o más. Agregue una instrucción en el método main que llama a este método wasHot .
//    //
	static void wasHot(double[] tempIn) {
		double   MAX_TEMP = 25;
		double[] aux      = new double[tempIn.length];
		int      col      = 0;
		for (int i = 0; i < tempIn.length; i++) {
			if (tempIn[i] > MAX_TEMP) {
				aux[i] = tempIn[i];
				col++;
			}
		}
		System.out.printf("\n***Temperaturas mayores a [%.1f]****\n", MAX_TEMP);

		for (int i = 0; i < aux.length; i++) {
			if (aux[i] > 0) {
				System.out.printf("dia %d: %.1f \n", i + 1, aux[i]);
			}
		}


	}

	//
//
//    //E10----
//    //Suponga que un array se ha declarado en el main de la siguiente manera:
//    //		int[] notaExamen;
//    //Este array se utilizará para almacenar  las calificaciones de los exámenes de los estudiantes.
//    //Escribir el código para cada uno de los siguientes métodos y la instrucción en main para llamarlo:
//    //(a) Un método, ingresarNotas, que solicita al usuario que ingrese las notas del examen (como enteros), almacena
//    // las notas  en un array y luego devuelve ese array.
//    //(b) Un método, modificarNota, permite modificar determinada  nota.
//
	static void modificarTemp(double[] vec) {
		Scanner opt = new Scanner(System.in);
		System.out.println("\n*********Modificar entradas*******");
		System.out.println("Por dia (D), por temperatura (T)");
		String opcion = opt.nextLine().toUpperCase();
//En caso de repetir la misma temperatura, buscar por dias y modificar.
		switch (opcion) {
			case "D":
				modPorDia(vec);
				break;
			case "T":
				modPorTemp(vec);
				break;
			default:
				System.out.println("F(por fecha) o T(por temp) para modificar");
				break;
		}

	}

	//
	private static double[] modPorTemp(double[] vec) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Temp a modificar");
		double temp = scanner.nextDouble();
		for (int i = 0; i < vec.length; i++) {
			if (vec[i]==temp) {
				System.out.printf("dia %d: %.2f", i + 1, vec[i]);
			}
		}
		vec = modPorDia(vec);


		return vec;
	}

	//
	static double[] modPorDia(double[] vec) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIntroduzca dia a modificar: ");
		int dia = scanner.nextInt();
		System.out.println("introduzca temp: ");
		double valor = scanner.nextDouble();

		vec[dia - 1] = valor;


		System.out.printf("nuevo valor dia %d: %.2f", dia, valor);
		return vec;

	}

	//Toda la semana estuvo fresco?1
	static boolean semanaFresca(double[] vec) {
		boolean fresco = false;
		for (double temps : vec) {
			if(temps >= 10) return false;
		}
		return true;
	}


	static int MenuOpt() {
		System.out.println("\n\n**** MENU ****");
		System.out.printf("1.- Ver datos de la semana.");
		System.out.printf("\n2.- Buscar temperaturas mayores a 25º.");
		System.out.printf("\n3.- Modificar entradas");
		System.out.printf("\n4.- Estuvo fresca la semana? (todos los dias a menos de 10 grados)");
		System.out.printf("\n5.- SALIR\n");
		System.out.println("Opcion:");
		Scanner scanner = new Scanner(System.in);
		int     opt     = scanner.nextInt();
		return opt;
	}


}
