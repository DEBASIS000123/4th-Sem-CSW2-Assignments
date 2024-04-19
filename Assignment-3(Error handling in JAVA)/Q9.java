import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the dividend: ");
            int a = sc.nextInt();

            System.out.println("Enter the divisor: ");
            int b = sc.nextInt();
            int result=a/b;
            System.out.println("Result of division : "+result);
        }
        catch(ArithmeticException e) {
            System.err.println("ArithmeticException occurred : "+e.getMessage());
        }
	}

}
