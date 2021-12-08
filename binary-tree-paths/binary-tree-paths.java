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
    List<String>ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        find(root,new StringBuilder());
        return ans;
    }
    public  void find(TreeNode root,StringBuilder path){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            path.append(root.val);
            ans.add(path.toString());
        }
        path.append(root.val).append("->");
        find(root.left,new StringBuilder(path.toString()));
        find(root.right,new StringBuilder(path.toString()));
        
        
    }
}