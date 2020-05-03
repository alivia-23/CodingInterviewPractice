// Question: 9
    /*
     * Smallest Difference pair between two sorted arrays
     * 
     * There are two sorted arrays, we have to find the pair which has smallest
     * difference,
     */
public class SmallestPairDifference {

	public static void main(String[] args) {
		int[] arr1 = {11,15,21,26};
        int[] arr2 = {2,6,18,39,45};
        int[] result = smallestPairDifference(arr1,arr2);
        printAll(result);
	}
	static int[] smallestPairDifference(int[] A, int[] B) {
		int i=0, j=0, a=0, b=0;
		int minValue = Integer.MAX_VALUE;
		while( i< A.length && j< B.length) {
			int diff = Math.abs(A[i] - B[j]);
			if( diff < minValue ) {
				minValue = diff;
				a = A[i];
				b = B[j];
			}
			
			if(A[i] < B[j]) {
				i++;
			}else {
				j++;
			}
			
		}
		int[] result = {a,b};
		return result;
	}
	
	static void printAll(int[] nums) {
		for(int x1: nums) {
			System.out.print(x1+ " ");
		}
	}

}
