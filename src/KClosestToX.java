// Question: 7
    // K Closest numbers to a number X
    /*
     * There is a sorted array, and a number X. We want to find K closest elements
     * to a number X
     * 
     * Input: arr1[] = {5, 6, 8, 10,12,21, 24,25,32,37,45,51 }; k = 3 X = 23 Output:
     * [24,25,21]
     */
public class KClosestToX {

	public static void main(String[] args) {
		int[] A = {5, 6, 8, 10,12,21, 24,25,32,37,45,51};
		int k = 3; int X = 23;
		int[] result = kClosestToX(A,k, X);
		printAll(result);
	}
	
	static int[] kClosestToX(int[] arr, int k, int x) {
		int l = 0; int h = arr.length-k;	
		while( l < h ) {
			int mid = l + (h-l)/2;
			int lDiff = Math.abs(arr[mid] - x);
			int rDiff = Math.abs(arr[mid +k]-x);
		    if ( lDiff > rDiff) {
			    l = mid + 1;
			}
		    else {
                h = mid;
		    }
		}
		int[] A = new int[k];
		for(int i=0; i<k; i++ ) {
			A[i] = arr[l+i];
		}
	    
		return A;
	}
	 static void printAll(int[] a) {
		 for(int i=0; i<a.length; i++) {
			 System.out.print(a[i]+ " ");
		 }
	 }

}
