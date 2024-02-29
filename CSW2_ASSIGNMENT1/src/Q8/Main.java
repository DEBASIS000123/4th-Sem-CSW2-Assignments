package Q8;

interface Vehicle {
 void accelerate();
 void brake();
}


class Car implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Car is accelerating.");
 }

 @Override
 public void brake() {
     System.out.println("Car is braking.");
 }


 public void accelerate(int speed) {
     System.out.println("Car is accelerating at " + speed + " mph.");
 }

 public void accelerate(int speed, int duration) {
     System.out.println("Car is accelerating at " + speed + " mph for " + duration + " seconds.");
 }
}


class Bicycle implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Bicycle is speeding up.");
 }

 @Override
 public void brake() {
     System.out.println("Bicycle is slowing down.");
 }


 public void accelerate(int speed) {
     System.out.println("Bicycle is accelerating at " + speed + " km/h.");
 }

 public void accelerate(int speed, int duration) {
     System.out.println("Bicycle is accelerating at " + speed + " km/h for " + duration + " seconds.");
 }
}


public class Main {
 public static void main(String[] args) {


     Car car = new Car();
     Bicycle bicycle = new Bicycle();

     System.out.println("Car actions:");
     car.accelerate();
     car.brake();

     System.out.println("\nBicycle actions:");
     bicycle.accelerate();
     bicycle.brake();

     System.out.println("\nMethod Overloading:");
     car.accelerate(60);
     car.accelerate(80, 5);

     bicycle.accelerate(20);
     bicycle.accelerate(30, 10);
 }
}

