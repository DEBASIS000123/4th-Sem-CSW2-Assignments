import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the base string:");
	        String baseString = scanner.nextLine();
	        System.out.println("Enter the number of concatenations:");
	        int numConcatenations = scanner.nextInt();

	     // Using StringBuilder
	        long startTimeStringBuilder = System.currentTimeMillis();
	        StringBuilder stringBuilderResult = new StringBuilder(baseString);
	        for (int i = 1; i < numConcatenations; i++) {
	            stringBuilderResult.append(baseString);
	        }
	        long endTimeStringBuilder = System.currentTimeMillis();
	        long elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
	        int finalLengthStringBuilder = stringBuilderResult.length();
	        
	        // Using StringBuffer
	        long startTimeStringBuffer = System.currentTimeMillis();
	        StringBuffer stringBufferResult = new StringBuffer(baseString);
	        for (int i = 1; i < numConcatenations; i++) {
	            stringBufferResult.append(baseString);
	        }
	        long endTimeStringBuffer = System.currentTimeMillis();
	        long elapsedTimeStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
	        int finalLengthStringBuffer = stringBufferResult.length();
	        
	        System.out.println("\nUsing StringBuilder...");
	        System.out.println("Time taken: " + elapsedTimeStringBuilder + " milliseconds");
	        System.out.println("Final string length: " + finalLengthStringBuilder);

	        System.out.println("\nUsing StringBuffer...");
	        System.out.println("Time taken: " + elapsedTimeStringBuffer + " milliseconds");
	        System.out.println("Final string length: " + finalLengthStringBuffer);
	        
	        long timeDifference = elapsedTimeStringBuffer - elapsedTimeStringBuilder;
	        System.out.println("\nComparison: " + (timeDifference >= 0 ?
	                "StringBuilder was faster than StringBuffer by " + timeDifference + " milliseconds." :
	                "StringBuffer was faster than StringBuilder by " + (-timeDifference) + " milliseconds."));
	    
	}

}
