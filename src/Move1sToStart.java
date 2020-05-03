    // Question: 4
    // Move all 1's to start of an array in a Binary array.
    /*
     * Binary array is an array with numbers 0 and 1, we have to move all the 1's to
     * start of the array in O(n) without extra memory. Do not use count sort. Count
     * sort will do the job in 2*O(n), Hint think like dutch flag
     * 
     * e.g. Input: [1,0,1,0,0,0,1,0,1,1,0] Output: [1,1,1,1,1,0,0,0,0,0,0]
     * 
     * 
     */
public class Move1sToStart {

	public static void main(String[] args) {
		int[] A = {1,0,1,0,0,0,1,0,1,1,0};
		move1sToStart(A);
		printAll(A);
        
    }
	
	static void move1sToStart(int[] arr) {
		int l = 0; int h = arr.length-1;
		
		while( l <  h) {
			while( arr[l] == 1) {
				l++;
			}
			while( arr[h] == 0) {
				h--;
			}
			if( l < h ) {
			   swap(arr, l, h);
			   l++; 			   
			   h--;
			}
		}
	}

	private static void swap(int[] arr, int l, int h) {
		int temp = arr[l];
		arr[l] = arr[h];
		arr[h] = temp;
		
	}
	private static void printAll(int[] nums) {
		for(int x1 : nums) {
			System.out.print(x1);
		}
	}

}
