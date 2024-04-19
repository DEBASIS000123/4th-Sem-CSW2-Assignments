
public class Q18 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        int sum = cal_sum(arr, 0);
        System.out.println("Sum of array elements: " + sum);

	}

	private static int cal_sum(int[] arr, int i) {
		if(arr.length==i) {
			return 0;
		}
		int curele=0;
		try {
			curele=arr[i];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		int sum=0;
		 try {
	            sum = cal_sum(arr, i + 1);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException during recursion at index " + (i + 1));
	        }
	        return curele + sum;
	}

}
