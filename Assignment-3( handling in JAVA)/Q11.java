import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter the value of x in degrees: ");
	            double x_deg = sc.nextDouble();
	            double x_rad = Math.toRadians(x_deg);

	            double res = Math.log((Math.sin(x_rad) + Math.cos(x_rad))/Math.tan(x_rad) - (1 / Math.tan(x_rad)));
	            if (Double.isNaN(res)) {
	                throw new ArithmeticException("Invalid mathematical operation");
	            }
	            System.out.println("Result: " + res);
	        }
	        catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
