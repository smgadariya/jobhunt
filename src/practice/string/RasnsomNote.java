/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines;
 * otherwise it will return false.
 *
 * Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
package practice.string;

import java.util.HashMap;
import java.util.Map;

public class RasnsomNote {

	public static void main(String[] args) {
		RasnsomNote ransomeNote= new RasnsomNote();
		//System.out.println(ransomeNote.canConstruct("aa", "aab"));
		System.out.println(ransomeNote.canConstructForWords("two times two is four","two times three is not four"));

	}

	private boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> charCount = new HashMap<>();
		for(char c: magazine.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}

		for(char c: ransomNote.toCharArray()) {
			if(!charCount.containsKey(c) || charCount.get(c)==0) {
				return false;
			} else {
				charCount.put(c, charCount.get(c) - 1);
			}
		}
		return true;

	}

	private boolean canConstructForWords(String ransomNote, String magazine) {
		Map<String, Integer> wordCount = new HashMap<>();
		for(String s: magazine.split(" ")) {
			wordCount.put(s, wordCount.getOrDefault(s, 0)+1);
		}

		for(String s: ransomNote.split(" ")) {
			if(!wordCount.containsKey(s) || wordCount.get(s)==0) {
				return false;
			}else {
				wordCount.put(s, wordCount.get(s)-1);
			}
		}
		return true;

	}
}
