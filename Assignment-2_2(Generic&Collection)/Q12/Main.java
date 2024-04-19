package Q12;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2,10,8,7,3,4,6,5,9};
		 
		 PriorityQueue<Integer> pq=new PriorityQueue<>();
		 for(int num:arr) {
			 pq.add(num);
		 }
		 
		 System.out.println("Dequeued Elements are:");
		 while(!pq.isEmpty()) {
			 System.out.println(pq.poll());
		 }
	}

}
