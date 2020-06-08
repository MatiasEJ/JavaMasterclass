package polymorphism;

class Movie{
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "no plot here";
	}
}

class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "a shark eats a lot of people";
	}
}

class IndependeceDay extends Movie{
	public IndependeceDay() {
		super("independece day");
	}
	
	@Override
	public String plot() {
		return "aliens attack the world";
	}
}

class Maze extends Movie{
	public Maze() {
		super("Maze");
	}
	
	@Override
	public String plot() {
		return "Maze attack the world";
	}
}

class StarWars extends Movie{
	public StarWars() {
		super("StarWars");
	}
	
	@Override
	public String plot() {
		return "Starwars attack the world";
	}
}

class Forgeteable extends Movie{
	public Forgeteable() {
		super("forgeteable");
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	
	public static Movie randomMovie() {
		int randomNumber = (int) ((Math.random() * 5) +1);
		System.out.println("Random number: "+randomNumber);
		switch(randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependeceDay();
		case 3:
			return new Maze();
		case 4:
			return new StarWars();
		case 5:
			return new Forgeteable();
		default:
			return null;
		}
		
	}
	
}
