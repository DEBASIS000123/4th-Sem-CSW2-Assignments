import java.util.*;
public class Q2 {
	public static void main(String []args) {
		String str="aej8ou";
		try{
			 if(str == null || str.isEmpty()) {
		            throw new NullPointerException("Input String is Null");
		        }
			 int c=0;
			 System.out.println("Numeric Character are :");
			 
			 for(int i=2;i<str.length();i++) {
				 char cur=str.charAt(i);
				 char prev=str.charAt(i-1);
				 char prevprev=str.charAt(i-2);
				 
				 if(Character.isDigit(cur)) {
					 if(isVowel(prevprev)&& !(isVowel(prev))) {
						 System.out.println(cur);
						 c++;
					 }
				 }
			 }
			 if(c==0) {
				 System.out.println("No Such Characters are present.");
			 }
			 
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
