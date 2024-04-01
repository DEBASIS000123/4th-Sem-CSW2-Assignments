package Q1;

public class Main {

	public static void main(String[] args) {
		Pair<Integer,String> p1=new Pair<>(1,"Mahesh");
		Pair<Integer,String> p2=new Pair<>(2,"Lucky");
		
		System.out.println("Key="+p1.getKey()+" Value="+p1.getValue());
		System.out.println("Key="+p2.getKey()+" Value="+p2.getValue());
	}

}
