package tpsParadigmas.domain;

import tpsParadigmas.animales.zoologico.Animal;
import tpsParadigmas.animales.zoologico.Ave;
import tpsParadigmas.animales.Zoologico;

import java.util.Scanner;

public class MainParadigmas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Zoologico zoo = Zoologico.dameInstancia(); // descomentar
		System.out.println("No hay lugar para más animales");
		while (true) {
			System.out.println("1: nuevo animal - 2: nueva ave - 3: describir todos - 4: show de aves - 0: salir");
			int opcion = Integer.parseInt(in.nextLine());
			if (opcion==0) {
				break;
			} else if (opcion==1) {
				System.out.println("Ingrese el nombre de la especie:");
				String especie = in.nextLine();
				zoo.agregar(new Animal(especie));
			} else if (opcion==2) {
				System.out.println("Ingrese el nombre de la especie:");
				String especie = in.nextLine();
				zoo.agregar(new Ave(especie));
			} else if (opcion==3) {
				zoo.describirTodos();
			} else if (opcion==4) {
				zoo.showDeAves();
			}
		}

		System.out.println("Cantidad de Animales en el ZOO: "+zoo.dameTodos().length);
		System.out.println("Cantidad de Aves en el ZOO: "+zoo.dameAves().length);


	}
}
