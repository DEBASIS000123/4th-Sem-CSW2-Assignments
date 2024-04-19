package Q11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		int arr[]= {1,7,3,6,2,4,9,10};
		System.out.println("Smallest missing number is:"+findmissingnum(arr));
	}

	private static int findmissingnum(int[] arr) {
		Arrays.sort(arr);
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=1;i<=arr.length;i++) {
			map.put(i, arr[i-1]);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getKey()!=entry.getValue()) {
				return entry.getKey();
			}
		}
		return 0;
	}
}
