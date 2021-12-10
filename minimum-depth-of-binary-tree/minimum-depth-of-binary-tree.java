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
        int ans;
    public int minDepth(TreeNode root) {
            ans=Integer.MAX_VALUE;
            minDepth(root,1);
           return  root==null ? 0:ans;   
    }
        public void minDepth(TreeNode root, int d){
                if(root==null) return;
                if(root.left==null && root.right==null)
                        ans=Math.min(ans,d);
                        minDepth(root.right,d+1);
                        minDepth(root.left,d+1);
                
        }
}