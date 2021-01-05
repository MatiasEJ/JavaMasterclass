
// 	INTRO:
//
// 			Ahora que sabemos arrays vamos a modelar un zoologico que puede contener varios animales.
// 			Este progama es interactivo,nos presenta un menu en el main y podemos elegir varias opciones.
// 			La logica del menu ya la hice yo,ustedes solo tienen que completar lo que hace cada opcion
// 			y crear las clases del paquete zoologico.
//
// 			JERARQUIA DE ANIMALES:
//
// 			Nuestra jerarquia de animales es muy simple:Animal y Ave.
//
// 			clase Animal:
// 			-dos atributos:especie(string),vuela(boolean)
// 			-un constructor que toma especie.vuela queda en false por defecto
// 			-sobreescribe el metodo toString de Object y retorna"Animal: ESPECIE"
//
// 			clase Ave:
// 			-extiende Animal
// 			-tiene constructor con los parametros que necesita para Animal,y setea vuela en true
// 			En este ejercicio,todos los animales que tienen vuela en true son Ave.
// 			-tiene el metodo volar()que imprime"Ave ESPECIE volando"
// 			-sobreescribe el metodo toString y retorna"Ave: ESPECIE"
//
// 			EL ZOOLOGICO:
//
// 			Nuestro Zoologico es muy pequeño,solo puede contener 5animales.
//
// 			clase Zoologico:
// 			-es una clase que admite una sola instancia(con el patron SINGLETON):
// 			-tiene constructor privado
// 			-tiene un metodo estatico dameInstancia()que devuelve la unica instancia
// 			-metodo agregar(Animal)agrega el animal al zoologico si es que hay lugar
// 			-si no hay lugar imprime"No hay lugar para más animales"(con la tilde en la á,ahora browxy lo permite)
// 			-metodo describirTodos()
// 			-primero imprime"Hay XXX animales y YYY lugares libres"
// 			-luego imprime para cada animal su descripcion(segun el metodo toString)
// 			-metodo showDeAves()
// 			-hace volar a todos los animales que son aves
// 			-tip:los animales que tienen vuela en true son Ave y se pueden castear
//
// 			PUNTOS EXTRA QUE NO ESTAN EN EL TEST:
//
// 			Va a haber puntos extras para los que puedan implementar estas funciones en la clase Zoologico:
// 			-dameTodos():devuelve un array de Animal del tamaño exacto de la cantidad de animales
// 			-dameAves():devuelve un array de Ave del tamaño exacto de la cantidad de aves
//
//
// 			====================================
//
//
// 			NOTA SOBRE CONSTANTES:
//
// 			El numero 5va a aparecer en varios lados en el codigo,porque es la cantidad maxima de animales.
// 			Imaginense que despues les digo"mejor que el maximo sea 6 " +
// 			"animales".Entonces tienen que cambiar por todos lados 5por 6.
// 			Esto no es muy prolijo y repite mucha informacion.
//
// 			Para esto es mejor usar algo como
//
// 			int MAX_ANIMALES=5;
//
// y luego usar MAX_ANIMALES en el codigo.
// 		Pero mejor que usar una variable es una constante:
// 		no queremos que alguien cambie el valor de MAX_ANIMALES durante la ejecucion.
// 		Una constante es como una variable pero con la palabrita"final"
//
// 		final int MAX_ANIMALES=5;
//
// "final"significa que es el valor final,que no puede cambiar.
// 		La convencion es poner las constantes en mayuscula.
//
// 		Tambien,como es una constante y no cambia,
// 		no tiene sentido que sea un atributo de cada objeto.
// 		Por esa razon,las constantes suelen ser estaticas:
//
// 		static final int MAX_ANIMALES=5;

