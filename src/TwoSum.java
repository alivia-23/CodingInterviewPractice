

import java.util.HashMap;

/* 
 * Question: 1
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice.
 * 
 * Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] =
 * 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int target = 9;
		TwoSum obj = new TwoSum();
		int[] indices = obj.twosum(arr, target);
		obj.printAll(indices);
	}
	
    public int[] twosum(int[] nums, int target) {
    	int n =nums.length;
    	HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0; i<n; i++){
    		int remValue= target - nums[i];
    		if(map.containsKey(remValue)){
    			return new int[] {map.get(remValue),i};
    		}else{
        		map.put(nums[i], i);
        	}
    	}
    	return null;
    }
    
    public void printAll(int[] nums) {
    	for(int i=0; i<nums.length; i++){
    		System.out.print(nums[i]+" ");
    	}
    }
}
