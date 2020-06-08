package challenges;

public class Comida {
	private boolean isNutritiva;
	private boolean isAGordada;
	
	public Comida(boolean isNutritiva, boolean isAGordada) {
		this.isNutritiva = isNutritiva;
		this.isAGordada = isAGordada;
	}
	
	public void meGuardan() {
		System.out.printf("hola soy comida...me estan guardando/n");
	}
	
	
	
	public boolean isNutritiva() {
		return isNutritiva;
	}
	public boolean isAGordada() {
		return isAGordada;
	}
	
	
	
	
}
