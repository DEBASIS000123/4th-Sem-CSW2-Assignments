package Q10;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		String text="hello how are you hello i am fine what about you";
		printmaxoccuredtext(text);
		
	}

	private static void printmaxoccuredtext(String text) {
		 String[] words = text.split("\\s+");
		 Hashtable<String, Integer> texts=new Hashtable<String, Integer>();
		 
		 for(String word:words) {
			 texts.put(word, texts.getOrDefault(word, 0) + 1);
		 }
		int c=0;
		for(int i:texts.values()) {
			c=Math.max(c, i);
		}
		
		System.out.println("Most occurring words are:");
		for(Entry<String, Integer> entry : texts.entrySet()) {
			if(entry.getValue()==c) {
				System.out.println(entry.getKey());
			}
		}
	}

}
