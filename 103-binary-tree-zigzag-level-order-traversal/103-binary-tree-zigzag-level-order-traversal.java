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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            while(size-->0){
                 TreeNode temp=q.poll();
                 l.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            if(level%2!=0){
                Collections.reverse(l);
            }
            ans.add(l);
            level++;
        }
        return ans;
    }
}