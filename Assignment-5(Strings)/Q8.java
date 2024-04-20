import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        
        String FirstnewString = firstString.concat(secondString);
        
        String secondnewString = firstString + secondString;
        
        System.out.println("\nConcatenated string using string method: " + FirstnewString);
        System.out.println("Concatenated string using + operator: " + secondnewString);
        
        System.out.println("Enter the Index no to show the Char:");
        int n=scanner.nextInt();
        System.out.println("The char at that index is:"+FirstnewString.charAt(n));
	}
}
