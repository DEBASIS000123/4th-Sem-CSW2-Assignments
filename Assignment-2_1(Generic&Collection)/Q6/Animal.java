package Q6;

public class Animal {
	private String name;
	private String color;
	private String type;
	public Animal(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public int hashCode() {
		return System.identityHashCode(this);
	}
	
}
