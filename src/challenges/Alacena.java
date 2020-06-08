package challenges;

public class Alacena {
	private Comida comida;
	private boolean harina;
	
	public Alacena(Comida comida, boolean harina) {
		this.comida = comida;
		this.harina = harina;
	}

	public void pasoComida() {
		comida.meGuardan();
		System.out.printf("paso comida a la heladera");
	}
	
	public Comida isComida() {
		return comida;
	}

	private boolean isHarina() {
		return harina;
	}
	
	public void guardaHarina() {
		System.out.printf("aca guardamo la harina");
	}
	
	
	
	
}
