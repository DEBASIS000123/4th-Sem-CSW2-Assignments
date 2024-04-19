package Q3;

public class Main {

	public static void main(String[] args) {
		Car c1=new Car("Wagon-r", "White", 50);
		Car c2=new Car("G-wagon", "Black", 300);
		System.out.println("Car detils :");
		System.out.println(c1);
		System.out.println(c2);
		
		if(c1.compareTo(c2)<1) {
			System.out.println("C2 has more speed.");
		}
		else if(c1.compareTo(c2)>1) {
			System.out.println("C1 has more speed.");
		}
		else {
			System.out.println("Both car has same speed.");
		}
	}

}
