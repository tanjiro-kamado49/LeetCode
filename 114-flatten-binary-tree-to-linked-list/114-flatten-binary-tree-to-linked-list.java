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
    public void flatten(TreeNode root) {
            if(root==null) return;
            flatten(root.left);
            flatten(root.right);
            TreeNode node=null;
            if(root.left!=null){
                   node =root.left;
                    // System.out.println("root.left-"+node.val);
                    while(node.right!=null) node=node.right;
            }
           
            if(node!=null){
                     // System.out.println("root.right-"+node.val);
                    TreeNode temp=root.right;
                    root.right=root.left;
                    root.left=null;
                    node.right=temp;
            }
            // System.out.println("******");
        
    }
}