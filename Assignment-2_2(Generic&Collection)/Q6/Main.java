package Q6;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Integer> set=new TreeSet();
		set.add(4);
		set.add(1);
		set.add(9);
		set.add(2);
		set.add(7);
		System.out.println("The tree set is:");
		System.out.println(set);
		
		System.out.println("Enter the number to check the no is present or not:");
		int n=sc.nextInt();
		System.out.println(set.contains(n)?"the number is present":"The number is not present");
		
		System.out.println("Enter the number to remove from list:");
		int m=sc.nextInt();
		set.remove(m);
		System.out.println("Success.");
	}

}
