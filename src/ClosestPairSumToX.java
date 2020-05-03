// Question: 5
    // Find closest pair from two sorted arrays
    /*
     * There are two sorted arrays, and a number X. Find two numbers one from each
     * array such that sum of both of them comes closest to number X
     * 
     * Input: arr1[] = {5, 6, 8, 10, 24}; arr2[] = {12, 15, 20, 25, 30}; x = 51
     * Output: 24 and 25
     * 
     * 
     */
public class ClosestPairSumToX {

	public static void main(String[] args) {
		int[] arr1 = {5, 6, 8, 10, 24};
        int[] arr2 = {12, 15, 20, 25, 30};
        int X = 51;
        int[] result = closestPairSumToX(arr1,arr2, X);
        printAll(result);
	}
	
	static int[] closestPairSumToX(int[] A, int[] B, int X ) {
		int min = Integer.MAX_VALUE;
		int i = 0, j = B.length - 1;
		int a=0,b=0;
		while( i <A.length && j>= 0) {
			int sum = A[i] + B[j];
			int diff = Math.abs(sum - X);
			if(diff < min) {
				min = diff;
				a = A[i];
				b = B[j];
			}
			if(sum < X) {
				i++;
			}else {
				j--;
			}
		}
		return new int[] {a,b};
	}
	
	static void printAll(int[] nums) {
		for(int x1: nums) {
			System.out.print(x1+ " ");
		}
	}

}
