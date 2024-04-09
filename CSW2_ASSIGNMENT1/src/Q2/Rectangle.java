package Q2;
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(3.0,5.0);


        System.out.println("Initial Length: " + myRectangle.getLength());
        System.out.println("Initial Width: " + myRectangle.getWidth());
        
       System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());

        myRectangle.setLength(10.0);
        myRectangle.setWidth(7.0);

        System.out.println("\nNew Length: " + myRectangle.getLength());
        System.out.println("New Width: " + myRectangle.getWidth());

        System.out.println("New Area: " + myRectangle.calculateArea());
        System.out.println("New Perimeter: " + myRectangle.calculatePerimeter());
    }
}
