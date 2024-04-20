import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        
        String firstStringLower = firstString.toLowerCase();
        String firstStringUpper = firstString.toUpperCase();
        String secondStringLower = secondString.toLowerCase();
        String secondStringUpper = secondString.toUpperCase();

        boolean isLowerEqual = firstStringLower.equals(secondStringLower);
        boolean isUpperEqual = firstStringUpper.equals(secondStringUpper);
        
        System.out.println("\nFirst String (Lowercase): " + firstStringLower);
        System.out.println("First String (Uppercase): " + firstStringUpper);
        System.out.println("Second String (Lowercase): " + secondStringLower);
        System.out.println("Second String (Uppercase): " + secondStringUpper);
        System.out.println("\nCase-insensitive equality LowerCase: " +isLowerEqual );
        System.out.println("\nCase-insensitive equality UpperCase: " +isUpperEqual );
	}

}
