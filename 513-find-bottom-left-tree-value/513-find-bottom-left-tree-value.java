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
    public int findBottomLeftValue(TreeNode root) {
            ArrayDeque<TreeNode>q=new ArrayDeque<>();
            q.add(root);
            int res=0;
            while(q.isEmpty()==false){
                    int l=0;
                    int size=q.size();
                    while(size-->0){
                            TreeNode cur=q.poll();
                            if(l==0){
                                    res=cur.val;
                                    // l++;
                            }
                            l++;
                            if(cur.left!=null)q.add(cur.left);
                            if(cur.right!=null) q.add(cur.right);
                    }
            }
            return res;
            
    }
}