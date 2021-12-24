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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Stack<List<Integer>>s=new Stack<>();
            if(root==null) return  new ArrayList<>(s);
            List<TreeNode>q=new ArrayList<>();
            q.add(root);
            while(!q.isEmpty()){
                    List<Integer>arr=new ArrayList<>();
                    int size=q.size();
                    while(size-->0){
                            TreeNode temp=q.remove(0);
                            arr.add(temp.val);
                            if(temp.left!=null) q.add(temp.left);
                            if(temp.right!=null) q.add(temp.right);
                    }
                    s.push(arr);  

            }
           Collections.reverse(s);
            return new ArrayList<>(s);
        
    }
}