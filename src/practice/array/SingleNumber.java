package practice.array;

public class SingleNumber {

	public static void main(String[] args) {
		 int ar[] = {2, 3, 5, 4, 5, 3, 4}; 
		 int ar1[] = {7,1,5,3,6,4}; 
		//System.out.println(singleNumber(ar));
		System.out.print(maxProfit(ar1));
	}

	public static int singleNumber(int[] nums) {
		int res = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i]; 
		}
		return res;
	}
	
	public static int maxProfit(int[] prices) {
        int m =  Integer.MAX_VALUE;
        int profit=0;
        for(int i:prices){
        	profit = Math.max(profit,i-m);
            m = Math.min(i,m);
        }
        return profit;
	}

}
