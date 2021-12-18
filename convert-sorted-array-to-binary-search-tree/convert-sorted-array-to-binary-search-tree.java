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
    public TreeNode sortedArrayToBST(int[] nums) {
            Arrays.sort(nums);
            TreeNode root=buildBST(nums,0,nums.length-1);
            return root;
        
    }
   TreeNode buildBST(int []nums,int l,int r){
           TreeNode node=new TreeNode();
           int mid;
           if(l>r) return null;
           if(l==r){
                   node.val=nums[l];
                   node.left=node.right=null;
           }
           else{
                  mid=l+(r-l)/2;
                   node.val=nums[mid];
                   node.left=buildBST(nums,l,mid-1);
                   node.right=buildBST(nums,mid+1,r);
           }
           return node;
   }
        
        
}