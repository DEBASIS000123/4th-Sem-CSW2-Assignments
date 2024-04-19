
public class Q20 {

	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 4, 5};
          traverseArray(arr, 0);
      }

      public static void traverseArray(int[] arr, int index) {
    	  
          try {
              System.out.println("Element at index " + index + ": " + arr[index]);
              traverseArray(arr, index + 1);
          }
          catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Reached end of array or index out of bounds.");
          }
      }
}
