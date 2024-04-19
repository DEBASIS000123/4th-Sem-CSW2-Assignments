import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter the value of x in degrees: ");
	            double x_deg = sc.nextDouble();
	            double x_rad = Math.toRadians(x_deg);

	            double sinX = Math.sin(x_rad);
	            double cosX = Math.cos(x_rad);

	            double numerator = sinX * cosX;
	            double denominator = sinX + cosX;

	            if (denominator == 0) {
	                throw new ArithmeticException("Division by zero");
	            }

	            double result = numerator / denominator;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input");
	        } finally {
	            sc.close();
	        }
	}

}
