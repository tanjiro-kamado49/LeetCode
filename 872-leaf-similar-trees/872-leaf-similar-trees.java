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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) { 
            List<Integer>leaf1=new ArrayList<>();
            List<Integer>leaf2=new ArrayList<>();
            preorder(root1,leaf1);
            preorder(root2,leaf2);
            if(leaf1.size()!=leaf2.size()) return false;
            for(int i=0;i<leaf1.size();i++){
                    if(leaf1.get(i)!=leaf2.get(i)) return false;
            }
            return true;
        
    }
        void preorder(TreeNode root,List<Integer>list){
                if(root==null) return;
                
                if(root.left==null && root.right==null){
                        list.add(root.val);
                }
                preorder(root.left,list);
                preorder(root.right,list);
        }
}