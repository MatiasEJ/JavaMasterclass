package challenge2;

class Car {
	private String engine = "true";
	private int wheels = 4;

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public Car(String engine, int wheels) {
		this.engine = engine;
		this.wheels = wheels;
	}

	public String startEngine() {
		return "No arranca viega";
	}

	public String accelerate() {
		return "No va a acelerar pelotudo, sino puede arrancar FISICA BASICA IMBECIL";
	}

}

class Camaro extends Car {
	public Camaro() {
		super("camaro", 4);
	}

	public String startEngine() {
		return "El camaro se prendio ameo";
	}

}

class falcon extends Car {
	public falcon() {
		super("El Falcon", 4);
	}

	public String startEngine() {
		return "El Falcon se prendio ameo";
	}

}

class mazdaMiata extends Car {
	public mazdaMiata() {
		super("Mazada", 18);
	}

	@Override
	public String startEngine() {
		return "El mazda arranco viega";
	}
}

class fiat600 extends Car {
	public fiat600() {
		super("fiat600", 18);
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * We are going to go back to the car analogy, create a base class caller Car.
		 * It should have a few fields that would be appriopiate for a generic car
		 * class: engine, cylinders, wheels Constructor should initalizae cylinders
		 * (number of) and name, and set the wheels to and engine to true. Cylinders and
		 * names would be passed parameters.
		 * 
		 * Create appriopiate getters
		 * 
		 * Create some methods like StartEngine, accelerate and brake
		 * 
		 * show a message for each in the base class now create 3 sub classes for your
		 * favorite vehicles Override the appropiate methods to demostrate polymorphism
		 * in use put all classe in one java file
		 **/
		for (int i = 0; i < 4; i++) {
			Car auto = randomCar();
			System.out.println("Auto# " + i + ": " + auto.getEngine() + "\n" + "ruedas:" + auto.startEngine() + "\n");

		}

	}

	public static Car randomCar() {
		int randomNumber = (int) ((Math.random() * 5) + 1);
		System.out.println("Random number: " + randomNumber);
		switch (randomNumber) {
		case 1:
			return new Camaro();
		case 2:
			return new falcon();
		case 3:
			return new mazdaMiata();
		case 4:
			return new fiat600();
		default:
			return null;
		}

	}

}
