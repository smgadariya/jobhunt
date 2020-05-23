package practice.string;

import java.util.HashMap;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.print(firstUniqChar("loveleetcode"));
	}
	
	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : s.toCharArray()) {
			if(map.get(c) ==1) {
				return s.indexOf(c);
			}
		}
		return -1;
				
	}


}
