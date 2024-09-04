package mani;

public class PrintStars {
	static void printStarWithSpace(int n) {
		
//		System.out.printf("%5s%n", new String(new char[5]).replace("\u0000", "* "));

		for (int i = 1; i <= n; i++) {
//			String pattern = "%" + (n + i) + "s%n";
//			String value = new String(new char[i]).replace("\0", "* ");
//			System.out.printf(pattern, value);
			
			System.out.printf("%" + (n + i) + "s%n", new String(new char[i]).replace("\0", "* "));
			
		}
	}

	static void printStarOdd(int n) {
		int star = 1;
		for (int i = 0; i < n; i++) {
			System.out.printf("%" + (n + i) + "s%n", new String(new char[star]).replace("\0", "*"));
			star += 2;
		}
	}

	public static void main(String[] args) {
		printStarWithSpace(5);
		printStarOdd(5);
	}
}
