

import java.util.HashSet;
//Question: 2

/*
 * Given two arrays, write a function to compute their intersection. Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2] Note: Each element in the
 * result must be unique. The result can be in any order.
 */
public class IntersectionTwoArray {

	public static void main(String[] args) {
		int[] A = {1,2,2,1};
		int[] B = {2,2};
		printAll(intersection(A,B));

	}
	
	static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> setA = new HashSet<Integer>();
		HashSet<Integer> result = new HashSet<Integer>();
		for(int i =0; i<nums1.length; i++) {
            setA.add(nums1[i]);
		}
		for(int j=0; j<nums2.length; j++) {
			if(setA.contains(nums2[j]))  {
				result.add(nums2[j]);
			}
		}
		
		int[] arr = new int[result.size()];
		int k = 0;
		for(int num : result) {
			arr[k] = num;
			k++;
		}
		return arr;
	}
	
	static void printAll(int[] nums) {
		for(int x1 : nums) {
			System.out.println(x1);
		}
	}

}
