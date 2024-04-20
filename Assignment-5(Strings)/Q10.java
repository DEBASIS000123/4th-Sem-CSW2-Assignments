import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        while (true) {
            System.out.println("\nString Explorer Menu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Retrieve character at index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
             
                    System.out.println("Result: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Result: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter the character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    if (inputString.contains(String.valueOf(searchChar))) {
                        System.out.println("Character '" + searchChar + "' found in the string.");
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index to retrieve character from: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < inputString.length()) {
                        System.out.println("Character at index " + index + ": " + inputString.charAt(index));
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 5:
                    System.out.print("Enter another string to concatenate: ");
                    String anotherString = scanner.nextLine();
                    System.out.println("Result: " + inputString.concat(anotherString));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }

	}

}
