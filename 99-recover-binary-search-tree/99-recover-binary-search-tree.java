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
   TreeNode a=null;
        TreeNode b=null;
        TreeNode prev=null;
    public void recoverTree(TreeNode root) {
            find(root);
            int temp=a.val;
            a.val=b.val;
            b.val=temp;
        
    }
        public boolean find(TreeNode node){
                if(node==null) return true;
                if(!find(node.left)) return false;
                if(prev != null && prev.val > node.val){
                                 b = node;
                                  if(a == null){
                                             a = prev;
                                   }else{
                                             return false;
                                    }
               }
                prev=node;
                 if(!find(node.right)) return false;
                return true;
                
        }
}