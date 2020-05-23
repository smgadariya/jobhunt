package practice.array;

import java.util.HashSet;

public class AmazonTask2 {

	public static void main(String[] args) {
		
		int a[] =new int[20000];
		for(int i=0;i<=10000;i++) {
			a[i]=1;
			a[++i]=2;
		}
		//System.out.println(a.length);
		//System.out.println(solution(new int[] {1,1,1,1,1,1}));
		//System.out.println(solution(4, "1B 2C,2D 4D","2B 2D 3D 4D 4A"));
		//System.out.println(solution(3, "1A 1B,2C 2C","1B"));
		System.out.println(solution(12, "1A 2A,12A 12A","12A"));
		//1,1
		/*
		 * for(int i: a) { System.out.println(i); }
		 */
	}

	public static String solution(int N, String S, String T) {
		
		int shrinkCounter=0;
		int hitCounter=0;
		String ship[] = S.split(",");
		String hit[] =T.split(" ");
		HashSet<String> hitSet = new HashSet<>();
		for(String hits : hit) {
			int start = hits.charAt(0);
			int end = hits.charAt(1);
			hitSet.add((start-49) + " "+(end-65));
		}
		
		for(String sh : ship) {
			int hitCount=0;
			int startingRow = sh.charAt(0);
			int endingRow = sh.charAt(3);
			int startingColumn = sh.charAt(1);
			int endingColumn = sh.charAt(4);
			int shipLength =0;
			for(int i =startingRow-49 ; i<=endingRow-49; i++) {
				for(int j=startingColumn-65;j<=endingColumn-65;j++) {
					if(hitSet.contains(i + " "+j)) {
						hitCount++;
					}					
					shipLength++;
				}
			}
			if(hitCount == shipLength) {
				shrinkCounter++;
			}else if(hitCount!=0) {
				hitCounter++;
			}
		}
		
		return shrinkCounter+","+hitCounter;
		
		
		// write your code in Java SE 8
		//int noOfReq = A.length;
		
		//}

	/*
	 * for(int i=1 ; i<1000000;i++){ if(!count.containsKey(i)) { return i; } }
	 */
		//return 1;

	}


}
