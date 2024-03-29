

/*Q5
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST
is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
*/
public class ConvertBSTSumGreaterThanNode {
	
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        convert(root);
        return root;
    }
    
    private TreeNode convert(TreeNode node){
        if(node == null) return null;
        
        convert(node.right);
        sum = sum + node.val;
        node.val = sum;
        convert(node.left);
        
        return node;
        
    }
}
