package Q5;

public class Main {

	public static void main(String[] args) {
		Student arr[]=new Student[4];
		arr[0]=new Student("A",1,10);
		arr[1]=new Student("B",4,20);
		arr[2]=new Student("C",2,30);
		arr[3]=new Student("D",3,40);
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j].compareTo(arr[j+1])==1) {
                   Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
			}
		}
		System.out.println("After Sorting the Array According to the rn :");
		for(Student i:arr) {
			System.out.println(i);
		}
	}

}
