package Q4;

public class Student {
	private String name;
	public Student(String name, int age, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	private int age;
	private double mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
}
