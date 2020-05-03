

public class MaxIndex {


	public static void main(String[] args) {
		int[] arr1 = {3,5,6,2,1,9};
		int[] arr2 = {2,4,4,1};
		MaxIndex obj = new MaxIndex();
		int result1 = obj.maxIndex(arr1);
		int result2 = obj.maxIndex(arr2);
		System.out.println("Maximum Index for array1: " + result1+ "\n" + 
		                   "Maximum Index for array2: " + result2);
	}
    
	public int maxIndex(int[] arr) {
		if(arr == null) {
			return -1;
		}
		int maxValue = Integer.MIN_VALUE;
		int maxIndex = -1;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
