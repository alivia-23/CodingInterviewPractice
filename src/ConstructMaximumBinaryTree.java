


/*Q6
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
*/
public class ConstructMaximumBinaryTree {
	
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null) return null;
        return construct(nums, 0, nums.length - 1);
    }
    
    private TreeNode construct(int[] nums, int low, int high){
        if(low > high) return null;
        
        int maxIndex = low;
        for(int i = low + 1; i <= high; i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        
        root.left = construct(nums, low, maxIndex - 1);
        root.right = construct(nums, maxIndex + 1, high);
        
        return root;
    }
}
