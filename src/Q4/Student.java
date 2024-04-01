package Q4;

public class Student implements Comparable<Student>{
	private String name;
	private int rn;
	private double total_mark;
	public Student(String name, int rn, double total_mark) {
		super();
		this.name = name;
		this.rn = rn;
		this.total_mark = total_mark;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(this.rn, o.rn);
	}
	
}
