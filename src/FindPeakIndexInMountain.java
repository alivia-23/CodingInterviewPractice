 // Question: 3

    /*
     * Let's call an array A a mountain if the following properties hold: A.length
     * >= 3 There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ...
     * A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] Given an array that is
     * definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i]
     * > A[i+1] > ... > A[A.length - 1].
     * 
     * Example 1: Input: [0,1,0] Output: 1 Example 2: Input: [0,2,1,0] Output: 1
     */

public class FindPeakIndexInMountain {

	public static void main(String[] args) {
		int[] arr = {0,1,0};
		System.out.println("Output1:"+findPeakIndexInMountain(arr));
		
		int[] arr1 = {0,2,1,0};
		System.out.println("Output2:"+findPeakIndexInMountain(arr1));
   }
	
	static int findPeakIndexInMountain(int[] nums) {
		int l=0; int h = nums.length;
		while(l<h) {
			int mid = l + (h-l)/2;
			if(nums[mid]< nums[mid+1]) {
				l = mid+1;
			}else {
				h = mid;
			}
		}
		return l;
	}

}
