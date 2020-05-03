/*
Q14
Given an integer array nums, find the contiguous subarray within an array (containing at least one number)
which has the largest product.
Examples:
Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/
public class MaxProduct {
	public int maxProduct(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		int curMax = nums[0];
		int curMin = nums[0];
		int resultMax = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			int temp = curMax;
			curMax = Math.max(Math.max(curMax * nums[i], curMin * nums[i]), nums[i]);
			curMin = Math.min(Math.min(temp * nums[i], curMin * nums[i]), nums[i]);
			
			if(curMax > resultMax) {
				resultMax = curMax;
			}
		}
		return resultMax;
	}

}
