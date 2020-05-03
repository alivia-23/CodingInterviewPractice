import java.util.ArrayList;
import java.util.List;

/*Q9
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
*/
public class PathSum {
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        findPathSum(root, sum, path, result);
        return result;
    }
    
    public void findPathSum(TreeNode node, int sum, List<Integer> path, List<List<Integer>>                                                                                      result){
        if(node == null) return;
        
        sum = sum - node.val;
        path.add(node.val);
       
        if(node.left == null && node.right == null && sum == 0){
            result.add(new ArrayList<Integer>(path));
        }
        findPathSum(node.left, sum, path, result);
        findPathSum(node.right, sum, path, result);
        path.remove(path.size()-1);
    }
}
