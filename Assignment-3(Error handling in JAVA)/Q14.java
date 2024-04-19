import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter the value of x in degrees: ");
	            double x_deg = sc.nextDouble();
	            double x_rad = Math.toRadians(x_deg);

	            double sinX = Math.sin(x_rad);
	            double cosX = Math.cos(x_rad);
	            double abs_val = Math.abs(sinX + cosX);

	            if (abs_val <= 0 || Double.isInfinite(abs_val)) {
	                throw new ArithmeticException("Invalid mathematical operation");
	            }

	            double log_val = Math.log(abs_val);
	            double tanX = Math.tan(x_rad);
	            double cotX = 1 / tanX;

	            double den = tanX - cotX;

	            if (den == 0) {
	                throw new ArithmeticException("Division by zero");
	            }

	            double result = log_val / den;
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
