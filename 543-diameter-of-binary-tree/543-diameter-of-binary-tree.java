/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
        
    }
    int max=Integer.MIN_VALUE;
    int dfs(TreeNode root){
        if(root==null) return 0;
        int l=dfs(root.left);
        int r=dfs(root.right);
        max=Math.max(max,l+r);
        return 1+Math.max(l,r);
    }
}