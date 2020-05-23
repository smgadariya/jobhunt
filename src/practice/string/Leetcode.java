package practice.string;

import java.util.ArrayList;
import java.util.List;

public class Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  List<String> list= buildArray(new int[] {2,3,4}, 4); for(String s : list) {
		  System.out.println(s); }
		 
		
		/*
		 * System.out.println(0^1^2); //3 System.out.println(0^2^2); // 0
		 * System.out.println(2^3^4); // System.out.println(2^4^4);
		 */

	}
	
	public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int j =0;
        for (int i=1 ; j<target.length; i++){
            if(target[j] == i){
                list.add("Push");
                j++;
            }else {
            	list.add("Push");
            	list.add("Pop");
            }
                        
        }
        return list;
        
        //[1,3,4,6,7,8]
        //9
        
       // ["Push","Push","Pop","Push","Push","Push","Pop","Push","Push","Push"]
        /*
         * Count Triplets That Can Form Two Arrays of Equal XOR
User Accepted:1971
User Tried:2393
Total Accepted:1984
Total Submissions:2914
Difficulty:Medium
Given an array of integers arr.

We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).

Let's define a and b as follows:

a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
Note that ^ denotes the bitwise-xor operation.

Return the number of triplets (i, j and k) Where a == b.

 

Example 1:

Input: arr = [2,3,1,6,7]
Output: 4
Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)
Example 2:

Input: arr = [1,1,1,1,1]
Output: 10
Example 3:

Input: arr = [2,3]
Output: 0
Example 4:

Input: arr = [1,3,5,7,9]
Output: 3
Example 5:

Input: arr = [7,11,12,9,5,2,7,17,22]
Output: 8
         */
    }

}
