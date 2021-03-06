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
    public int deepestLeavesSum(TreeNode root) {
            if(root==null) return 0;
            LinkedList<TreeNode>q=new LinkedList<>();
            q.add(root);
            int sum=0;
            while(q.isEmpty()==false){
                    int size=q.size();
                    sum=0;
                    while(size-->0){
                            TreeNode cur=q.remove(0);
                            sum+=cur.val;
                            if(cur.left!=null) q.add(cur.left);
                            if(cur.right!=null) q.add(cur.right);
                            
                    }
            }
            return sum;
        
    }
}