package tpsEstructuras;

import java.util.Scanner;

public class MainEstructuras {
	public static void main(String[] args) {
		Scanner    scanner     = new Scanner(System.in);
		int        nEmpleados  = 15;
		int        nDatos      = 3;
		int[]      nLegajo     = new int[nEmpleados];
		String[]   nombres     = new String[nEmpleados];
		int[]      fNacimiento = new int[nEmpleados]; //Podria ser de tipo Date.
		String[][] matriz      = new String[nEmpleados][nDatos];
		for (int i = 0; i < nEmpleados; i++) {
			System.out.print("nLegajo: ");
			nLegajo[i] = scanner.nextInt();
			System.out.print("Nombre: ");
			nombres[i] = scanner.next();
			System.out.print("fNac: ");
			fNacimiento[i] = scanner.nextInt();
		}
		for (int i = 0; i < nEmpleados; i++) {
			for (int j = 0; j < nDatos; j++) {
				if(j == 0) matriz[i][j] = Integer.toString(nLegajo[i]);
				if(j == 1) matriz[i][j] = (nombres[i]);
				if (j == 2)	matriz[i][j] = Integer.toString(fNacimiento[i]);

			}
		}
		for (int i = 0; i < nEmpleados; i++) {
			for (int j = 0; j < 3; j++) {

				if(j == 0)  System.out.print("Legajo: " + matriz[i][j] + " - ");
				if(j == 1) System.out.print("Nombre: " + matriz[i][j] + " - ");
				if (j == 2)	System.out.print("Fnacimiento: " + matriz[i][j] );

			}
			System.out.println();
		}


		// System.out.println("......----------.........");
		// for (int i = 0; i < nEmpleados; i++) {
		// 	System.out.printf("%d - %s - %d \n", nLegajo[i], nombres[i], fNacimiento[i]);
		// }


	}
}
