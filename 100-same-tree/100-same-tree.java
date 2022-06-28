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
    public void func(TreeNode p,TreeNode q,boolean[]ans){
        if(p==null && q==null){
            return ;
        }
        else if((p==null && q!=null) ||(p!=null && q==null)) {
            ans[0]=false;
            return;
        }
        
        else if(p.val==q.val){
            func(p.left,q.left,ans);
            func(p.right,q.right,ans);
            
        }
        else{
            ans[0]=false;
            return;
        }
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
       boolean[]ans=new boolean[1];
        ans[0]=true;
        func(p,q,ans);
        return ans[0];
    
        
    }
}