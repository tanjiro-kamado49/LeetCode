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
     List<Integer> preorder=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
       if(root==null) return preorder;
       Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            preorder.add(temp.val);
            if(temp.right!=null){
                st.push(temp.right);
            }
            if(temp.left!=null) st.push(temp.left);
        }
            return preorder;
    }

}