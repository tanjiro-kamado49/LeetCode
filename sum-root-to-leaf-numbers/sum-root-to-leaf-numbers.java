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
    public int sumNumbers(TreeNode root) {
        find(root,new StringBuilder());
        int sum=0;
        for(int i=0;i<ans.size();i++){
            int x=Integer.parseInt(ans.get(i));
            sum+=x;
        }
        return sum;
        
    }
    public void find(TreeNode root,StringBuilder path){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            path.append(root.val);
            ans.add(path.toString());
        }
        path.append(root.val);
        find(root.left,new StringBuilder(path.toString()));
        find(root.right,new StringBuilder(path.toString()));
    }
}