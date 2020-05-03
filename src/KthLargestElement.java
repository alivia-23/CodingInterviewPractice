

import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] arr1 = {3,2,1,5,6,4};
		int k1 = 2;
		int[] arr2 = {3,2,3,1,2,4,5,5,6};
		int k2 = 4;
		KthLargestElement obj = new KthLargestElement();
		int result1 = obj.findKthLargest(arr1, k1);
		int result2 = obj.findKthLargest(arr2,k2);
		System.out.println("Kth Largest Element for input array1: " +result1);
		System.out.println("Kth Largest Element for input array2: " +result2);
	}
	
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0; i<nums.length; i++) {
			minHeap.add(nums[i]);
			if(minHeap.size()> k) {
				minHeap.poll();
			}
		}
		return minHeap.peek();
	}

}
