package practice.array;

//Kadane's algorithm
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int a[]=maxSubArray(new int[] {-4,-1,0,3,10});
		for(int i: a) {
			System.out.println(i);
		}
	}
	
	 public static int[] maxSubArray(int[] nums) {
		 int n = nums.length;
		 
	        int[] leftProduct = new int[n];
	        int[] rightProduct = new int[n];
	        int[] output = new int[n];
	        
	        leftProduct[0]=1;
	        rightProduct[n-1]=1;
	        
	        for(int i=1;i<n;i++) 
	        	leftProduct[i]= nums[i-1]*leftProduct[i-1];
	        	
	        	for(int i=n-2;i>=0;i--) 
	        		rightProduct[i]= nums[i+1]*rightProduct[i+1];
	        	
	        	for(int i=0;i<n;i++) 
	        		output[i] = leftProduct[i]*rightProduct[i];
		        	
	        
	        return output;
	    }
}
