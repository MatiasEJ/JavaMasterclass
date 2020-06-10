package polymorphism;



import javax.swing.JOptionPane;

class Movie{
	private String name;
	
	public String getName() {
		return name;
	}

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
		
//		apellido = JOptionPane.showInputDialog(null, "PONE TU APELLIDO GUACHO", "PONELE UN TITULO", 3);
//		valor = JOptionPane.showInputDialog(null, "PONE UN VALOR","dale guachin",1);
//		JOptionPane.showMessageDialog(null, apellido, "que onda", 1   );
//		valores = Integer.parseInt(valor);
//		JOptionPane.showMessageDialog(null, valores);
//		String[] options = {"MasaMadre", "Muerte", "Muerte"};
//		int x = JOptionPane.showOptionDialog(null, "Si fueras Marcos, que usas para hacer pan?",
//                "Marco's Choice",
//                JOptionPane.DEFAULT_OPTION, 0, null, options, options[1]);
//		JOptionPane.showMessageDialog(null, options);
		for(int i= 1; i<11;i++) {
			Movie movie = randomMovie();
			System.out.println("Movie# "+i+": "+movie.getName()+"\n"+"PLOT:"+movie.plot()+"\n");
		}

	
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
