package practice.array;

//Kadane's algorithm
public class SortedSquaredArray {

	public static void main(String[] args) {
		int a[]=maxSubArray(new int[] {-4,-1,0,3,10});
		for(int i: a) {
			System.out.println(i);
		}
	}
	
	 public static int[] maxSubArray(int[] nums) {
	        int[] output = new int[nums.length];
	        int left=0;
	        int right=nums.length-1;
	        for(int i=nums.length-1;i>=0; i--){
	        	if(Math.abs(nums[left])>nums[right]) {
	        		output[i]= nums[left]*nums[left];
	        		left++;
	        	}else {
	        		output[i]=nums[right]*nums[right];
	        		right--;
	        	}
	        }
	        return output;
	    }
}
