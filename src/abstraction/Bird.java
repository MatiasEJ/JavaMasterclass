package abstraction;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"is eating");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub

	}

	public abstract void fly();

}
