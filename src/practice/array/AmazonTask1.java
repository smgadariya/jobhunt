package practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AmazonTask1 {

	public static void main(String[] args) {
		
		int a[] =new int[20000];
		for(int i=0;i<=10000;i++) {
			a[i]=1;
			a[++i]=2;
		}
		//System.out.println(a.length);
		//System.out.println(solution(new int[] {1,1,1,1,1,1}));
		System.out.println(solution(a));
		/*
		 * for(int i: a) { System.out.println(i); }
		 */
	}

	public static boolean solution(int[] A) {
		// write your code in Java SE 8
		//int noOfReq = A.length;
		int totalTime = 0;
		//Map<Integer, Integer> count = new HashMap<>();
		for(int i=0 ; i<A.length;i++){
			totalTime+=A[i];
			//count.put(A[i], count.getOrDefault(A[i], 0)+1);		
		}
		Arrays.sort(A);
		for(int i=0 ; i<A.length-1;i++) {
			if((totalTime-A[i]-A[i+1])%3==0)return true;
		}
		return false;
		//}

	/*
	 * for(int i=1 ; i<1000000;i++){ if(!count.containsKey(i)) { return i; } }
	 */
		//return 1;

	}


}
