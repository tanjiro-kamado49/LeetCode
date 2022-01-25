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
        public void inorder(List<TreeNode> list, TreeNode root){
                if(root!=null){
                        inorder(list,root.left);
                        list.add(root);
                        inorder(list,root.right);  
                }    
        }
    public TreeNode increasingBST(TreeNode root) {
            List<TreeNode>list=new ArrayList<>();
            inorder(list,root);
            
            TreeNode head=list.remove(0);
            head.right=null;
            TreeNode tail=head;
            while(list.isEmpty()!=true){
                    //System.out.println(list.get(0).val);
                   tail.right=list.remove(0);
                    tail=tail.right;
                     //System.out.println("tail "+tail.val);
                    tail.left=null;
                    
            }
            tail.right=null;
            return head;
        
    }
        
}