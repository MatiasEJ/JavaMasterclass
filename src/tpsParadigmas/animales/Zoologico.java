package tpsParadigmas.animales;
//EL ZOOLOGICO:
//
// 			Nuestro Zoologico es muy pequeño,solo puede contener 5animales.
//
// 			clase Zoologico:
// 			-es una clase que admite una sola instancia(con el patron SINGLETON):


import tpsParadigmas.animales.zoologico.Animal;
import tpsParadigmas.animales.zoologico.Ave;

import java.util.Arrays;

//
public class Zoologico {
	private static Zoologico instancia;
	private final int      MAX_ANIMALES  = 5;
	private       int      cant_animales = 0;
	private       Animal[] animales      = new Animal[MAX_ANIMALES];

	//-tiene constructor privado
	private Zoologico() {
	}

	//-tiene un metodo estatico dameInstancia()que devuelve la unica instancia
	public static Zoologico dameInstancia() {
		if(instancia == null){
			instancia = new Zoologico();
		}
		return instancia;
	}

	//-metodo agregar(Animal)agrega el animal al zoologico si es que hay lugar
	//-si no hay lugar imprime"No hay lugar para más animales"(con la tilde en la á,ahora browxy lo permite)
	public void agregar(Animal agregarAnimal) {
		if (this.cant_animales < MAX_ANIMALES) {
			this.animales[this.cant_animales] = agregarAnimal;
			this.cant_animales++;
		} else {
			System.out.println("No hay lugar para m \u00E1 s animales");
		}

	}

	//-metodo describirTodos()
	//-primero imprime"Hay XXX animales y YYY lugares libres"
	//-luego imprime para cada animal su descripcion(segun el metodo toString)
	public void describirTodos() {
		System.out.printf("Hay %d animales y %d lugares libres.\n", cant_animales, MAX_ANIMALES - cant_animales);

		for (int i = 0; i < this.cant_animales; i++) {
			System.out.println(animales[i]);
		}
	}

	//-metodo showDeAves()
	//-hace volar a todos los animales que son aves
	//-tip:los animales que tienen vuela en true son Ave y se pueden castear
	public void showDeAves() {
		for (int i = 0; i < this.cant_animales; i++) {
			if (animales[i].isVuela()) {
				Ave ave = (Ave) animales[i];
				ave.volar();
			}

		}

	}


	//	PUNTOS EXTRA QUE NO ESTAN EN EL TEST:
	//
	// 			Va a haber puntos extras para los que puedan implementar estas funciones en la clase Zoologico:
	// 			-dameTodos():devuelve un array de Animal del tamaño exacto de la cantidad de animales
	// 			-dameAves():devuelve un array de Ave del tamaño exacto de la cantidad de aves
	public Animal[] dameTodos() {
		Animal[] todos = Arrays.copyOfRange(animales,0,cant_animales);
		// for(int i = 0;i < cant_animales;i++){
		// 	todos[i] = animales[i];
		// }
		return todos;
	}

	public Ave[] dameAves() {
		int cant_aves = 0;
		int enJaula = 0;
		Ave[] jaula = new Ave[cant_animales];
		for (int i = 0; i < this.cant_animales; i++) {
			if (animales[i].isVuela()) {
				jaula[enJaula] = (Ave)animales[i];
				enJaula++;
				cant_aves++;
			}
		}
		return Arrays.copyOfRange(jaula, 0, cant_aves);
	}

}
