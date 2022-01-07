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
    public List<Integer> rightSideView(TreeNode root) {
            List<TreeNode>q=new ArrayList<>();
            List<Integer>ans=new ArrayList<>();
            if(root==null) return ans;
            q.add(root);
            while(!q.isEmpty()){
                    int n=q.size();
                 for(int i=0;i<n;i++){
                    TreeNode node=q.remove(0);
                    if(i==n-1) ans.add(node.val);
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                 }
            }
            return ans;
        
    }
}