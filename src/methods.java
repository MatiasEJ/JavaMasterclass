/****
 * Method Overloading
 ****/

public class methods {
	/****
	 * 
	 ****/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		calculate(gameOver, score, levelCompleted, bonus);
		score = 10000;
		levelCompleted = 8;
		calculate(gameOver, score, levelCompleted, bonus);
	}

	public static void calculate(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted + bonus);
			finalScore += 1000;
			System.out.println("your final score" + finalScore);
		}
	}
}
