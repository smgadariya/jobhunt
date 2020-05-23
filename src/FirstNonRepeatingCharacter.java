import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		FirstNonRepeatingCharacter obj= new FirstNonRepeatingCharacter();
		System.out.println(obj.firstNonRepeatingCharacterWithMap("aabbcdde"));

	}

	private char firstNonRepeatingCharacter(String s) { // this is o(n^2)
		for(int i=0 ; i<s.length(); i++) {
			boolean isDuplicate=false;
			for(int j=0; j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j) && i!=j) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				return s.charAt(i);
			}
		}
		return '_';
	}
	
	private char firstNonRepeatingCharacterWithMap(String s) { // this is o(2*n)
		Map<Character,Integer> charFrequency = new HashMap();
		for(int i=0 ; i<s.length(); i++) {
			char c = s.charAt(i);
			if(charFrequency.containsKey(c)) {
				charFrequency.put(c, charFrequency.get(c)+1);
			}else {
				charFrequency.put(c, 1);
			}
		}
		for(int i=0 ; i<s.length(); i++) {
			char c = s.charAt(i);
			if(charFrequency.get(c) ==1) {
				return s.charAt(i);
			}
			
		}
		return '_';
	}
	
	private char firstNonRepeatingCharacterWithArray(String s) { // this is o(2*n) //size of 26 Array
		int[] charArray =new int[26];
		for(char c : s.toCharArray()) {
			charArray[c-'a']++;
		}
		for(char c : s.toCharArray()) {	
		 if(charArray[c-'a'] == 1) 
			 return c;
		}
		return '_';
	}
	
	private char firstNonRepeatingCharacterUsingLastIndex(String s) { // this is o(n) 
		for(int i=0 ; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
				return s.charAt(i);
		}
		return '_';
	}
	

}
