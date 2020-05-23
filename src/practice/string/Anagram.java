package practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		if(a.length() != b.length())return false;
		Map<Character, Integer> count1 = new HashMap<>();
		a=a.toLowerCase();
		b=b.toLowerCase();
		for(char c : a.toCharArray()){
			count1.put(c, count1.getOrDefault(c,0)+1);
		}
		Map<Character, Integer> count2 = new HashMap<>();
		for(char c : b.toCharArray()){
			count2.put(c, count2.getOrDefault(c,0)+1);
		}
		
		if(count1.equals(count2)) 
			return true; 
		else 
			return false;
	}
	static boolean isAnagram2(String a, String b) {
		// Complete the function
		if(a.length() != b.length())return false;
		int[] a1 =new int[26];
		int[] a2 =new int[26];
		a=a.toLowerCase();
		b=b.toLowerCase();
		for(char c : a.toCharArray()){
			a1[c-'a']++;
		}
		for(char c : b.toCharArray()){
			a2[c-'a']++;
		}
		
		if(a1.equals(a2)) 
			return true; 
		else 
			return false;
	}

	public static void main(String[] args) {
		boolean ret = isAnagram("hello", "Hello");
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
