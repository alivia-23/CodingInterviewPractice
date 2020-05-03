import java.util.ArrayList;
import java.util.List;

/*
Q10
Given a binary tree, return the preorder traversal of its nodes' values.
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
*/

//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
  public class PreOrderTraversal {
	List<Integer> output = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return output;
     }
    
     void helper(TreeNode root){
         if(root == null) return;
         output.add(root.val);
         preorderTraversal(root.left);
         preorderTraversal(root.right);
    }

}
