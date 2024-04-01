package Q3;

import java.util.ArrayList;
import java.util.Collections;

public class CarApp {

	public static void main(String[] args) {
		Car c1=new Car(2013,"creta",10);
		Car c2=new Car(2020,"MG",13);
		Car c3=new Car(2018,"KIA",20);
		Car c4=new Car(2015,"BMW",55);
		ArrayList <Car>car=new ArrayList();
		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);
		Collections.sort(car);
		System.out.println(car);
	}

}
