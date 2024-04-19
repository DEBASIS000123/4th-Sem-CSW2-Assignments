package Q5;

import java.util.HashMap;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<Integer, Book> library=new HashMap();
		library.put(1,new Book(100,"Java","John"));
		library.put(2,new Book(100,"python","rama"));
		
		System.out.println("Library details :");
		for(Book b:library.values()) {
			System.out.println(b);
		}
		
		System.out.println("Enter Book name to check present or not:");
		String dltbook=sc.next();
		int c=0;
		for(Book b:library.values()) {
			if(b.getName().equals(dltbook)) {
				System.out.println("Book is present.");
				c++;
			}
		}
		if(c==0) {
			System.out.println("Book is not present.");
		}
		
		System.out.println("Enter the key to remove the Book:");
		int key=sc.nextInt();
		library.remove(key);
		System.out.println("Book Removed.");
	}

}
