package Q4;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList <Student> data=new LinkedList<>();
		data.add(new Student("Mahesh",10,99));
		data.add(new Student("Lucky",11,98));
		data.add(new Student("Silu",11,97));
		data.add(new Student("chiku",20,95));
		
		while(true) {
			System.out.println("Enter Your choice:");
			System.out.println("0. Exit");
			System.out.println("1. Disply List");
			System.out.println("2. Search Student");
			System.out.println("3. Remove Student");
			System.out.println("4. Count no of Student");
			System.out.println("5. Check Student");
			int ch=sc.nextInt();
			switch(ch) {
			case 0:System.out.println("Thank you.");
					return;
			case 1:System.out.println("Student Detils :");
				for(int i=0;i<data.size();i++) {
				Student temp=data.get(i);
				System.out.println(temp);
			}
			break;
			
			case 2:System.out.println("Enter student detils: ");
			String n=sc.next();
			int age=sc.nextInt();
			double mark=sc.nextDouble();
			Student s=new Student(n,age,mark);
			if(checkstudent(data,s)!=-1) {
				System.out.println("Student is present.");
			}
			else {
				System.out.println("Student is not present.");
			}
			break;
			
			case 3:System.out.println("Enter the Student name to remove.");
			String name=sc.next();
			for(int i=0;i<data.size();i++) {
				Student temp=data.get(i);
				if(temp.getName().equals(name)) {
					data.remove(i);
				}
			}
			break;
			
			case 4:System.out.println("No of students Are: "+data.size());
			break;
			
			case 5:System.out.println("Enter student detils: ");
			String n1=sc.next();
			int age1=sc.nextInt();
			double mark1=sc.nextDouble();
			Student s1=new Student(n1,age1,mark1);
			int val=checkstudent(data,s1);
			if(val==-1) {
				System.out.println("Student is not present.");
			}
			else {
				System.out.println("Student is present at index:"+val);
			}
			}
		}
		
	}

	private static int checkstudent(LinkedList<Student> data, Student s) {
		for(int i=0;i<data.size();i++) {
			Student temp=data.get(i);
			if(temp.getName().equals(s.getName()) && temp.getAge()==s.getAge() && temp.getMark()==s.getMark()) {
				return i;
			}
		}
		return -1;
	}

}
