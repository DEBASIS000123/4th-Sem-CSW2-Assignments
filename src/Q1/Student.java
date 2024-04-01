package Q1;

public class Student <T>{
	private String name;
	private T roll;
	private int age;
	public Student(String name, T roll, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", age=" + age + "]";
	}
	
	
	
}
