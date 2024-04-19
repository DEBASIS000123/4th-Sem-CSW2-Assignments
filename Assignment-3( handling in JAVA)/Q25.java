import java.util.InputMismatchException;
import java.util.Scanner;
public class Q25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		try {
			int a=sc.nextInt();
			System.out.println("Entered Number is:"+a);
		}
		catch(InputMismatchException e) {
			System.out.println(e+"  Input a Number Only !!!");
		}
	}

}
