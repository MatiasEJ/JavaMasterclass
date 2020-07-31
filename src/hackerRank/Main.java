package hackerRank;

public class Main {
	public static void main(String[] args) {
		int n = 6;
		if (n % 2 != 0) {
			System.out.printf("weird");
		} else if ((n % 2 == 0) && n >= 2 && n <= 5) {
			System.out.printf(" not weird");
		} else if ((n % 2 == 0) && n >= 6 && n <= 20) {
			System.out.printf("weird");
		} else if (n > 20) {
			System.out.printf("weird");

		}
	}
}
