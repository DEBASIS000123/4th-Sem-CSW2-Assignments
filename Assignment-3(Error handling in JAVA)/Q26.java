import java.lang.reflect.Method;

public class Q26 {

	public static void main(String[] args) {
		 try {
	            Class cls = Class.forName("SomeClass");
	            Method method = cls.getMethod("someMethodd");
	            method.invoke(null);
	        } catch (ClassNotFoundException e) {
	            System.out.println("Class not found: " + e);
	        } catch (NoSuchMethodException e) {
	            System.out.println("Method not found: " + e);
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed");
	        }
	}

}
