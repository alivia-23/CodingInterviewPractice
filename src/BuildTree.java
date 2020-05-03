
/*Q8
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
*/
public class BuildTree {
    int preIndex=0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, inorder.length-1);
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder, int inStart, int inEnd){
        if(inStart>inEnd) return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int inIndex = findIndex(root, inorder);
        root.left = buildTree(preorder, inorder, inStart, inIndex-1);
        root.right = buildTree(preorder, inorder, inIndex+1, inEnd);
        return root;
    }
    
    public int findIndex(TreeNode node, int[] inorder){
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]==node.val){
                return i;
            }
        }
        return 0;
    }
}
