package Q3;

public class Car implements Comparable <Car>{
	private int modelNo;
	private String name;
	private int stock;
	public Car(int modelNo, String name, int stock) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.stock = stock;
	}
	@Override
	public int compareTo(Car c) {
		return Integer.compare(this.stock, c.stock);
	}
	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", name=" + name + ", stock=" + stock + "]";
	}
}
