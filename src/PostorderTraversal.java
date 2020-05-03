import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/*Q10

	Given a binary tree, return the postorder traversal of its nodes' values.
	
	Example:
	
	Input: [1,null,2,3]
	   1
	    \
	     2
	    /
	   3
	
	Output: [3,2,1]
*/

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.addFirst(node.val);
            
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return result;
    }
}
