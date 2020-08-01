package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("chicha");
		dog.breath();
		dog.eat();

		Parrot parrot = new Parrot("Lorox");
		parrot.breath();
		parrot.fly();
		parrot.eat();

	}

}
