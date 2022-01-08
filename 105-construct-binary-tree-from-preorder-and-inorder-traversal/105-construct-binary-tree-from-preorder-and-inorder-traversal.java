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
       public  HashMap<Integer,Integer>hm=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n=preorder.length;
            for(int i=0;i<inorder.length;i++){
                    hm.put(inorder[i],i);
            }
            TreeNode node=solve(preorder,inorder,0,n-1,0,n-1);
            return node;
            
    }
        public TreeNode solve(int[]preorder,int inorder[],int startIn,int finalIn,int startPre,int finalPre){
                if(startPre==finalPre){
                        return new TreeNode(preorder[startPre]);
                }
                int index=hm.get(preorder[startPre]);
                int size=index-startIn;
                TreeNode node =new TreeNode(preorder[startPre]);
                if(index!=startIn){
                        node.left=solve(preorder,inorder,startIn,index - 1, startPre + 1, startPre + size);
                }
                if(index!=finalIn){
                        node.right=solve(preorder,inorder,  index + 1, finalIn, startPre + size + 1, finalPre);
                }
                return node;
        }
}