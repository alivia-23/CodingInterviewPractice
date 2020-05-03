// Question: 8
    /*
     * Remove Duplicates from Sorted Array Given a sorted array nums, remove the
     * duplicates in-place such that each element appear only once and return the
     * new length. Do not allocate extra space for another array, you must do this
     * by modifying the input array in-place with O(1) extra memory.
     * 
     * Example 1: Given nums = [1,1,2], Your function should return length = 2, with
     * the first two elements of nums being 1 and 2 respectively. Example 2: Given
     * nums = [0,0,1,1,1,2,2,3,3,4], Your function should return length = 5, with
     * the first five elements of nums being modified to 0, 1, 2, 3, and 4
     * respectively.
     */
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] A = {1,1,2};
		int length = removeDuplicates(A);
		printAll(A, length);
		int[] A1 = {0,0,1,1,1,2,2,3,3,4};
		int length1 = removeDuplicates(A1);
		printAll(A1, length1);
	}
	
	static int removeDuplicates(int[] A) {
		if( A == null || A.length == 0) {
			return 0;
		}
		int j=0;
		for(int i=0; i<A.length-1; i++) {
			if(A[i] != A[i+1]){
				A[j] = A[i];
				j++;
			}
		}
		A[j] = A[A.length-1];
		return j+1;
	}
	
	static void printAll(int[] nums, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(nums[i] +" ");
		}
		System.out.println("length:" +n);
	}

	
}
