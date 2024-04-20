import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        char[] charArray = inputString.toCharArray();
        
        System.out.println("Enter a character to search in the string:");
        char searchChar = scanner.next().charAt(0);

        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        
        System.out.println("\nCharacter Array:");
        System.out.println(charArray);
        
        if (firstIndex != -1 && lastIndex != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchChar + "' at index: " + lastIndex);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
	}

}
