import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer:");
		int num = sc.nextInt();
		try {
			double sqRoot = calculateSquareRoot(num);
			System.out.println("Square root of " + num + " is: " + sqRoot);
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException occurred: " + e.getMessage());
		}
	}

	private static double calculateSquareRoot(int num) {
		if(num<0) {
			throw new ArithmeticException("Cannot calculate square root of a negative number!");
		}
		return Math.sqrt(num);
	}

}
