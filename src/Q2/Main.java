package Q2;

public class Main {

	public static void main(String[] args) {
		Book b1=new Book(1, "Java", 99.9);
		Book b2=new Book(2,"Python",105.4);
		System.out.println("Book Detils:");
		System.out.println(b1);
		System.out.println(b2);
		
		if(b1.equals(b2)) {
			System.out.println("Book Price is same.");
		}
		else{
			System.out.println("Book Price is different.");
		}
	}

}
