package challenge2; /**
 * 
 */

/**
 * @author keta
 *
 */
public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tails;
	private int teeth;
	private String coat;
	
	
	public Dog(int size, int weight, String name, int eyes, int legs, int tails, int teeth, String coat) {
		super(1, 1, size, weight, name);
		// TODO Auto-generated constructor stub
		this.eyes = eyes;
		this.legs = legs;
		this.tails = tails;
		this.teeth = teeth;
		this.coat = coat;
		
	}
	
	private void chew() {
		System.out.println("dog is chewing");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog is eating, and: ");
		chew();
		super.eat();
	}
	

	public void walk() {
		System.out.println("dog is walking");
		move("walking");
	}
	public void run() {
		System.out.println("dog is running");
		move("running");
	}
	public void moveLegs(String speed) {
		System.out.printf("moviendo las patitas");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		moveLegs(speed);
		super.move(speed);
	}
	
	

}
