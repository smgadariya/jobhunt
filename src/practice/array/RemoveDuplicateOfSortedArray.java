package practice.array;

public class RemoveDuplicateOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(removeDuplicates(new int[] {1,1,1,2,2,3}));
		System.out.println(removeDuplicatesIfMorethanTwo(new int[] {1,1,1,2,2,3}));
	}
	public static int removeGivenValue(int[] nums, int val) {
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != val){
                nums[++i] = nums[j];
            }
        }
        return i+1;       
    
    }
	
	public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i+1;       
    
    }
	
	public static int removeDuplicatesIfMorethanTwo(int[] nums) {
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(j<nums.length-2 && nums[j]== nums[j+2]){
            	continue;
            }
            nums[i++] = nums[j];
        }
        return i;       
    
    }

}
