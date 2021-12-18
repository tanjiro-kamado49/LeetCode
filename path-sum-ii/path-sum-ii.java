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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans=new ArrayList<>();
            find(root,ans,targetSum,0,new ArrayList());
            return ans;
        
    }
        void find(TreeNode root , List<List<Integer>>ans, int targetSum,int sum,List<Integer>arr ){
                if(root == null) return;
                if(root.left==null && root.right==null){
                        if((sum+root.val)==targetSum){
                                arr.add(root.val);
                                ans.add(new ArrayList(arr));
                                arr.remove(arr.size()-1);
                        }
                        return;
                }
                arr.add(root.val);
                find(root.left,ans,targetSum,sum + root.val,arr);
                 find(root.right,ans,targetSum,sum + root.val,arr);
                arr.remove(arr.size()-1);
        }
}