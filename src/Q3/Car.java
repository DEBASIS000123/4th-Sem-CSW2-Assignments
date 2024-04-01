package Q3;

public class Car implements Comparable <Car>{
	private String model;
	private String color;
	private int speed;
	public Car(String model, String color, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	@Override
	public int compareTo(Car o) {
		return Integer.compare(this.speed, o.speed);
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}
	
	
}
