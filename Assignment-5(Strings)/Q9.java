import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a sentence:");
	        String sentence = scanner.nextLine();
	        System.out.println("Enter the word to search for:");
	        String searchWord = scanner.next();
	        System.out.println("Enter the word to replace it with:");
	        String replaceWord = scanner.next();

	        
	        int startIndex = sentence.indexOf(searchWord);
	        int endIndex = startIndex + searchWord.length();
	        
	        if (startIndex != -1) {
	            String modifiedSentence = sentence.substring(0, startIndex) +
	                                      replaceWord +
	                                      sentence.substring(endIndex);

	            System.out.println("\nOriginal sentence: " + sentence);
	            System.out.println("Modified sentence: " + modifiedSentence);
	        } else {
	            System.out.println("Word '" + searchWord + "' not found in the sentence.");
	        }
	}

}
