package Q9;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,2,8,6,3,6,0,3,8,9,5,};
		printrepetedele(arr);
	}

	private static void printrepetedele(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet();
		HashSet<Integer> repetedset=new HashSet();
		for(int i:arr) {
			if(set.contains(i)) {
				repetedset.add(i);
			}
			else {
				set.add(i);
			}
		}
		System.out.println("The repeted Integers are:");
		for(int i:repetedset) {
			System.out.print(i+" ");
		}
	}

}
