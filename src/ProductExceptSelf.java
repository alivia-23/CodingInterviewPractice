/* Bonus Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n). */

public class ProductExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        int rightP = 1;
        for(int i = nums.length-1; i>=0; i--){
            result[i] = result[i] * rightP;
            rightP = rightP * nums[i];
        }
        return result;
    }
}
