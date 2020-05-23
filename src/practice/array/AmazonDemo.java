package practice.array;

import java.util.HashMap;
import java.util.Map;

public class AmazonDemo {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {-1,-3}));
		/*
		 * for(int i: a) { System.out.println(i); }
		 */
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		Map<Integer, Integer> count = new HashMap<>();
		for(int i=0 ; i<A.length;i++){
			count.put(A[i], count.getOrDefault(A[i], 0)+1);		
		}

		for(int i=1 ; i<1000000;i++){
			if(!count.containsKey(i)) {
				return i;
			}
		}
		return 1;
	}


}
