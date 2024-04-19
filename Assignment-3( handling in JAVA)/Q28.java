
public class Q28 {

	public static void main(String[] args) {
		try {
			printnum(1);
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverflowError caught: " + e.getMessage());
		}
	}

	private static void printnum(int i) {
		System.out.println(i);
		printnum(i+1000);
	}

}
