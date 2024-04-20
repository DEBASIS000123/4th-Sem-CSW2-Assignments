
public class Q2 {

	public static void main(String[] args) {
		
		String str1=new String("Hello");
		String str2=new String(" World");
		str1.concat(str2);
		System.out.println(str1);
		str1=str1.concat(str2);
		System.out.println(str1);
		
		System.out.println();
		System.out.println("usage of CharSequence interface");
		CharSequence c="Hello World";
		System.out.println("length of CharSequence: "+c.length());
		System.out.println("Char at index 6: "+c.charAt(6));
		System.out.println("Subsequence from index 3 to 5: "+c.subSequence(3, 5));
	}

}
