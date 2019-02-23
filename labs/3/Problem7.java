package lab3;

public class Problem7 {

	public static void main(String[] args) {
		//Prints out the first 50 pentagonal numbers
		System.out.println("The first 50 pentagonal numbers are: ");
		for (int i = 1; i < 51; i++) {
			System.out.printf("%7d", getPentagonalNumber(i));
			if (i % 10 == 0)
				System.out.println();
		}
	}

	public static int getPentagonalNumber(int n) {
		
		//Calculates pentagonal number
		return (n * (3 * n - 1)) / 2;
	}

}

