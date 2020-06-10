package challenge1;

public class Heladera {
	private Comida comida;
	private boolean frio;
	private boolean congelador;
	
	public Heladera(Comida comida, boolean frio, boolean congelador) {
		this.comida = comida;
		this.frio = frio;
		this.congelador = congelador;
	}
	
	
	
	public void guardoComida() {
		comida.meGuardan();
		System.out.println("soy heladera guardo comida");
	}
	
	
	private Comida isComida() {
		return comida;
	}
	
	private boolean isFrio() {
		return frio;
	}
	private boolean isCongelador() {
		return congelador;
	}
	
	public void acaEnfriamo() {
		System.out.printf("aca enfriamo");
	}
	
	
	
}
