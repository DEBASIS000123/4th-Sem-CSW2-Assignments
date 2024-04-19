import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Number:");
			String s = sc.next();
			int num = Integer.parseInt(s);
			System.out.println("Entered number is:"+num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
