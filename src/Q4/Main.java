package Q4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[4];
		arr[0]=new Student("A",1,10);
		arr[1]=new Student("B",2,20);
		arr[2]=new Student("C",3,30);
		arr[3]=new Student("D",4,40);
		
		System.out.println("Enter Student Detils to search the student :");
		String nm=sc.next();
		int rn=sc.nextInt();
		double mark=sc.nextDouble();
		
		Student s=new Student(nm, rn, mark);
		int c=0;
		for(int i=0;i<arr.length;i++) {
			Student temp=arr[i];
			if(s.compareTo(temp)==0) {
				System.out.println("Student is present.");
				c++;
				return;
			}
		}
		if(c==0) {
			System.out.println("Student is Not present.");
		}
		
	}

}
