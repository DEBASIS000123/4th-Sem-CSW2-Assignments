import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer();

        while (true) {
            System.out.println("\nText Editor Menu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    break;
                case 2:
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    text.insert(insertIndex, insertText);
                    break;
                case 3:
                    System.out.print("Enter start index to delete: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index to delete: ");
                    int endIndex = scanner.nextInt();
                    text.delete(startIndex, endIndex);
                    break;
                case 4:
                    text.reverse();
                    break;
                case 5:
                    System.out.print("Enter start index to replace: ");
                    int replaceStartIndex = scanner.nextInt();
                    System.out.print("Enter end index to replace: ");
                    int replaceEndIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter replacement text: ");
                    String replacementText = scanner.nextLine();
                    text.replace(replaceStartIndex, replaceEndIndex, replacementText);
                    break;
                case 6:
                    System.out.println("Exiting text editor. Final text:");
                    System.out.println(text);
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }

            System.out.println("Current state of text: " + text);
            System.out.println("Capacity of StringBuffer: " + text.capacity());
            System.out.println("Length of StringBuffer: " + text.length());
        }

	}

}
