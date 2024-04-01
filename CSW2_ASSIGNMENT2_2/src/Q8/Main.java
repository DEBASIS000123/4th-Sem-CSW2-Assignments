package Q8;

import java.util.HashMap;

public class Main {
	public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            int count = charCountMap.get(c);
            if (count == 1) {
                charCountMap.remove(c);
            } else {
                charCountMap.put(c, count - 1);
            }
        }

        return charCountMap.isEmpty();
    }
	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = "lloeH";

        if (areAnagrams(str1, str2)) {
            System.out.println("Two Strings are anagrams.");
        } else {
            System.out.println("Two Strings are not anagrams.");
        }

	}

}
