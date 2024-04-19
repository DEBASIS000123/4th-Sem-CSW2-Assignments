
public class Q5 {
	public static Double getValue() {
        return null;
    }
	public static double complexMath(double x) {
        double rad = Math.toRadians(x);
        double sin_val = Math.sin(rad);
        return sin_val;
}
	public static void main(String[] args) {
		try {
            Double value =getValue();            
            double result = complexMath(value);         
            System.out.println("Result : " + result);
        }
        catch (NullPointerException e) {
            System.err.println("Input Value Cannt be Null: "+e);
        }
        catch (Exception e) {
            System.err.println("Error occurred : "+e);
        }

	}

}
