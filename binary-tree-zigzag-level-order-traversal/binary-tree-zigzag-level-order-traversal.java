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
            List<List<Integer>> ans=new ArrayList<>();
            if(root==null) return ans;
            List<TreeNode>q=new ArrayList<>();
            q.add(root);
            int l=0;
            while(!q.isEmpty()){
                    int size=q.size();
                    l++;
                    List <Integer>arr=new ArrayList<>();
                    for(int i=0;i<size;i++){
                            TreeNode c=q.remove(0);
                            arr.add(c.val);
                            if(c.left!=null)
                                    q.add(c.left);
                            if(c.right!=null)
                                    q.add(c.right);
                    }
                    if(l%2==0)
                            Collections.reverse(arr);
                    ans.add(arr);
            }
            return ans;
        
    }
}