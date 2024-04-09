package Q3;
public class Point {
    private double x;
    private double y;

   
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Point(Point otherPoint) {
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
      
        Point point1 = new Point(5.5,9.4);

        Point point2 = new Point(point1);

       
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");

        point1.setX(4.5);
        point1.setY(7.6);

        System.out.println("\nAfter modification:");
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
    }
}
