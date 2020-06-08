package challenges;

public class Kitchen {
	private Heladera heladera;
	private Alacena alacena;
	private String horno;
	
	public Kitchen(Heladera heladera, Alacena alacena, String horno) {
		this.heladera = heladera;
		this.alacena = alacena;
		this.horno = horno;
	}

	public Heladera getHeladera() {
		return heladera;
	}

	public Alacena getAlacena() {
		return alacena;
	}


	public String getHorno() {
		return horno;
	}

	
	
	
}
