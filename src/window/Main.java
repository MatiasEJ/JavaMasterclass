package window;

import java.util.Scanner;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static final String lineas = "\n==--------------------------------==";

	public static void main(String[] args) {
		//MyWindow myWindow = new MyWindow("Testeando Ventanas");
		//myWindow.setVisible(true);
		System.out.println(lineas);
		sumaCalificaciones();
		System.out.println(lineas);
		salarioSemanal();
	}

	/**
	 * Suma de 3 calificaciones.
	 */
	public static void sumaCalificaciones(){
		System.out.println("Ejercicio 1");
		double sumaNotas = 0;
		System.out.println("Suma de 3 notas");
		for (int i = 0; i<3;i++){
			System.out.printf("Nota %d:",i+1);
			sumaNotas += scanner.nextDouble();
		}
		System.out.printf("Suma de las notas= %.2f",sumaNotas);
	}

	/**
	 * Hacer un programa que calcule e imprima el salario semanal de un
	 * empleado a partir de sus horas semanales trabajadas y de su
	 * salario por hora
	 */
	public static void salarioSemanal() {
		System.out.println("Ejercicio 2");
		System.out.printf("%-31s","Horas Trabajadas en la semana:");
		int horasSem = scanner.nextInt();
		System.out.printf("%-31s","Salario por hora:");
		double salarioHora = scanner.nextDouble();
		double salarioSemanal = horasSem * salarioHora;

		System.out.printf("Salario semanal:%20.1f %s", salarioSemanal, lineas );

	}

}
