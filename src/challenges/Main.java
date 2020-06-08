/**
 * 
 */
package challenges;

/**
 * @author keta
 *
 */
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Create a single room of a house using composition.
		 * Think about the thins that should be included in the room.
		 * Maybe physical parts of the house but furniture as well.
		 * Add at leasst one method, then ad on metho to hide object but to 
		 * acces the object used in composition
		 * 
		 * ***/
		Comida soyComida = new Comida(true, true);
		Heladera miHeladera = new Heladera(soyComida, false, false);
		Alacena miAlacena = new Alacena(soyComida,false);
		
		
		
		Kitchen casaAye = new Kitchen(miHeladera, miAlacena, "horno pepito");
		
		casaAye.getAlacena().pasoComida();
		
		
		
		
	}

}
