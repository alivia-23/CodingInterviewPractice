/*
Q7
Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order. You may assume no duplicates in the array.
Examples:
Input: [1,3,5,6], 5
Output: 2

Input: [1,3,5,6], 2
Output: 1

Input: [1,3,5,6], 0
Output: 0
*/
public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(nums[mid] == target)return mid;
            if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

}
