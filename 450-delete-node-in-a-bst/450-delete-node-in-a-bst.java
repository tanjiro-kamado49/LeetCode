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
        public TreeNode findmax(TreeNode t){
                if(t==null) return null;
                else if(t.right==null) return t;
                else{
                        return findmax(t.right);
                }
        }
    public TreeNode deleteNode(TreeNode root, int data) {
            TreeNode temp=null;
            if(root==null){
                    return null;
            }
            if(data<root.val) {
                    root.left=deleteNode(root.left,data);
                   // return root;
            } 
            else if(data>root.val ) {
                    root.right=deleteNode(root.right,data);
                   // return root;
            }
            else{
                    if(root.left!=null && root.right!=null){
                            temp= findmax(root.left);
                            root.val=temp.val;
                            root.left=deleteNode(root.left,root.val);
                           // return root;
                    }
                    else{
                            temp=root;
                            if(root.left==null){
                                    root= root.right;
                            }
                            else if(root.right==null){
                                   root= root.left;
                            }
                            else{
                                    root= null;
                            }
                    }
            }
            return root;
    }
}