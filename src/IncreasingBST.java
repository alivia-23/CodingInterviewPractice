import java.util.ArrayList;
import java.util.List;

/*Q2
Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree,
and every node has no left child and only 1 right child.

Example 1:
Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  
Note:

The number of nodes in the given tree will be between 1 and 100.
Each node will have a unique integer value from 0 to 1000.
*/
public class IncreasingBST {
	
    List<Integer> values = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        TreeNode dummy = new TreeNode(-1);
        TreeNode current = dummy;
        for(int num : values){
            current.right = new TreeNode(num);
            current = current.right;
        }
        return dummy.right;
    }
    
     void inOrder(TreeNode root){
         if(root == null) return;
         inOrder(root.left);
         values.add(root.val);
         inOrder(root.right);
     }
}
