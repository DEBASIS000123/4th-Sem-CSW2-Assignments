import java.util.Arrays;

public class Q19 {

	public static void main(String[] args) {
		  int[] arr = {11, 3, 2, 7, 4, 9};
	        try {
	            Arrays.sort(arr);
	            System.out.println("Sorted array: " + Arrays.toString(arr));
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException during sorting: " + e.getMessage());
	        }
	        try {
	            int idx = binarysearch(arr, 10);
	            if(idx==-1) {
	            	System.out.println("Element is Not present.");
	            }
	            else {
	            	System.out.println("Element found at index: " + idx);
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException during searching: " + e.getMessage());
	        }
	        try {
	            System.out.println("Element at index 10: " + arr[10]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException while accessing element at index 10: " + e.getMessage());
	        }
	}
	  public static int binarysearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1;
	    }
}
