package practice.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LuckBalance {

	// Complete the luckBalance function below.
	static int luckBalance(int k, int[][] contests) {

		/*
		 * for(int i=0; i<contests.length;i++) { System.out.println(contests[i][0] + " "
		 * + contests[i][1]); }
		 */
		
		int luck=0;
		int importance = 0;


		Arrays.sort(contests, new Comparator<int[]>(){

			@Override public int compare(int[] arg0, int[] arg1) { // TODO Auto-generated
				return -1 * Integer.compare(arg0[0], arg1[0]); }

		});


		for(int i=0; i<contests.length;i++) {
			//luck = contests[i][0];
			importance = contests[i][1];
			
			if(importance == 1 && k>0) {
				k--;
				luck = luck +contests[i][0];
			}else if(importance == 1 && k==0) {
				luck = luck -contests[i][0];
			}else {
				luck = luck +contests[i][0];
			}
			
		}

		return luck;


	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[][] contests = new int[n][2];

		for (int i = 0; i < n; i++) {
			String[] contestsRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++) {
				int contestsItem = Integer.parseInt(contestsRowItems[j]);
				contests[i][j] = contestsItem;
			}
		}
		int result = luckBalance(k, contests);
		System.out.println(result);

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
