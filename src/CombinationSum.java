/*
Q4
Given an integer array with all positive numbers and no duplicates,
find the number of possible combinations that add up to a positive integer target.

Example:
nums = [1, 2, 3]
target = 4

The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)

Note that different sequences are counted as different combinations.

Therefore the output is 7.
*/
public class CombinationSum {
	public int combinationSum(int[] nums, int target) {
		if(nums == null || nums.length == 0 || target == 0) {
			return 0;
		}
		
		int[] ways = new int[target + 1];
		ways[0] = 1;
		
		for(int i = 1; i <= target; i++) {
			for(int number : nums) {
				if(i >= number) {
					ways[i] += ways[i - number];
				}
			}
		}
		return ways[target];
	}

}
