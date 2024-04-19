import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         String input = sc.nextLine();
         try {
             int num = Integer.parseInt(input);
             try {
                 int result = 10 / num;
                 System.out.println("Result: " + result);
             }
             catch (ArithmeticException e) {
                 System.out.println("Error: ArithmeticException - Division by zero");
             }
         }
         catch (NumberFormatException e) {
             System.out.println("Error: NumberFormatException - Invalid input");
         }
         finally {
        	 sc.close();
         }
	}

}
