package practice.array;

public class LeftRotation {
	public static void main(String[] args) {
		int a[]=rotLeft(new int[] {1,2,3,4,5}, 4);
		for(int i: a) {
			System.out.println(i);
		}
	}
	
	static int[] rotLeft(int[] a, int d) {

        int n = a.length;
        int[] ans = new int[n];
        int ansIndex=d;
        int i=0;
        for(i=0; ansIndex<n;i++){
            ans[i]=a[ansIndex];
            ansIndex++;
        }
        ansIndex=0;
        for(; ansIndex<d;i++){
            ans[i]=a[ansIndex];
            ansIndex++;
        }

        return ans;
	}
}
