import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String input = sc.nextLine();
        try
        {
            System.out.println(Integer.parseInt(input));
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred : Invalid input!! Please enter a valid integer!");
        }
        finally {
        	sc.close();
        }

	}

}
