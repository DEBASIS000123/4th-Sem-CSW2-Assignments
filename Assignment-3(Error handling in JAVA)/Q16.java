
public class Q16 {

	public static void main(String[] args) {
	        int[] arr = {0,1,1,2,2,3};
	        try {
	            int ele = arr[20];
	            System.out.println("Element at index 20 " + " is: " + ele);
	        } catch (ArrayIndexOutOfBoundsException e) {
	           e.printStackTrace();
	        }
	}

}
