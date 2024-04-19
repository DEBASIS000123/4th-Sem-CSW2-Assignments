import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter the value of x in degrees: ");
	            double x_deg = sc.nextDouble();
	            double x_rad = Math.toRadians(x_deg);

	            double sinX = Math.sin(x_rad);
	            double cosX = Math.cos(x_rad);

	            double num = Math.sqrt(Math.abs(sinX * cosX));
	            double den = Math.tan(x_rad) + 1;

	            if (den == 0 || Double.isNaN(num)) {
	                throw new ArithmeticException("Invalid mathematical operation");
	            }

	            double result = num / den;
	            System.out.println("Result: " + result);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	}

}
