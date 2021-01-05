package tpsParadigmas.animales.zoologico;

public class Animal {
	// clase Animal:
	// -dos atributos:especie(string),vuela(boolean)
	protected String especie;
	protected boolean vuela;


	//-un constructor que toma especie.vuela queda en false por defecto
	public Animal(String especie) {
		this.especie = especie;
		this.vuela = false;
	}

	public boolean isVuela() {
		return vuela;
	}

	//-sobreescribe el metodo toString de Object y retorna"Animal: ESPECIE"
	@Override
	public String toString() {
		return "Animal: "+this.especie;
	}
}
