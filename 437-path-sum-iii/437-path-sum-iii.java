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
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
    public int pathSum(TreeNode root, int targetSum) {
            map.put(0,1);
            return Sum(root,targetSum,0);     
        
    }
        public int Sum(TreeNode root,int tar,int curSum){
                if(root==null) return 0;
                curSum+=root.val;
                count+=map.getOrDefault(curSum-tar,0);
                map.put(curSum,map.getOrDefault(curSum,0)+1);
                Sum(root.left,tar,curSum);
                Sum(root.right,tar,curSum);
                map.put(curSum,map.get(curSum)-1);
                return count;
        }
        
}