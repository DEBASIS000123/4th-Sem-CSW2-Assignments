
public class Q1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(str1==str2);
		
		System.out.println(s1.equals(s2));
		System.out.println(str1.equals(str2));
	}

}
