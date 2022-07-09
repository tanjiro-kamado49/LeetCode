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
class nodeValue{
    int maxl;
    int minr;
    int sum;
    int ans;
    // boolean isBST;
    nodeValue(int maxl,int minr,int sum,int ans){
        this.maxl=maxl;
        this.minr=minr;
        this.sum=sum;
        this.ans=ans;
        // this.isBST=isBST;
    }
}
class Solution {
    public nodeValue func(TreeNode root){
          if(root==null){
            return new nodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
        }
        nodeValue left=func(root.left);
        nodeValue right=func(root.right);
        if( root.val>left.maxl && root.val<right.minr){
           int sum=left.sum+right.sum+root.val;
            return new nodeValue(Math.max(root.val,right.maxl),Math.min(root.val,left.minr),sum,Math.max(Math.max(left.ans,right.ans),sum));
        }
        return new nodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0,Math.max(left.ans,right.ans));
    }
    public int maxSumBST(TreeNode root) {
        return func(root).ans;
      
        
    }
}