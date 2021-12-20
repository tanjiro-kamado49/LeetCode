/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            TreeNode left,right;
            if(root==null) return root;
            if(root==p || root==q) return root;
            left=lowestCommonAncestor(root.left,p,q);
            right=lowestCommonAncestor(root.right,p,q);
            if(left!=null && right!=null){
                    return root;
            }
            else  
                    return (left!=null?left:right);
        
    }
}