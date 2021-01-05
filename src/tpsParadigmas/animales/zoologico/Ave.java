package tpsParadigmas.animales.zoologico;

//clase Ave:
	//-extiende Animal
public class Ave extends Animal {

	//-tiene constructor con los parametros que necesita para Animal,y setea vuela en true
	public Ave(String especie) {
		super(especie);
		this.vuela = true;
	}

	//En este ejercicio,todos los animales que tienen vuela en true son Ave.
	//-tiene el metodo volar()que imprime"Ave ESPECIE volando"
	public void volar() {
		System.out.printf("Ave %s volando.\n", this.especie);
	}

	//-sobreescribe el metodo toString y retorna"Ave: ESPECIE"
	@Override
	public String toString() {
		return "Ave: " + this.especie;
	}
}
