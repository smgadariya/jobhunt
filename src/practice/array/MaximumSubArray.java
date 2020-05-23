package practice.array;

//Kadane's algorithm
public class MaximumSubArray {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	
	 public static int maxSubArray(int[] nums) {
	        int max= nums[0];
	        int currnetSum = nums[0];
	        for(int i=1;i<nums.length; i++){
	            currnetSum = Math.max(nums[i], currnetSum+nums[i]);
	            max= Math.max(currnetSum, max);
	        }
	        return max;
	    }
	 
	 // [4,-1,2,1];

}
