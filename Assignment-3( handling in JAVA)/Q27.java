
public class Q27 {

	public static void main(String[] args) {
		try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
            System.out.println("Number: " + num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
	}

}
