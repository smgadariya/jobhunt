//Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

/*
 * Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. 
Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. 
The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occurring sub-array from the left if sum equals to sub-array, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

*
*/

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		SubarrayWithGivenSum obj= new SubarrayWithGivenSum();
		System.out.println(obj.firstNonRepeatingCharacter("aabbcdde"));

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
}
