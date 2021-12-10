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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length || inorder==null || postorder==null){
            return null;
        }
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            h.put(inorder[i],i);
        }
        return construct(inorder,0,inorder.length-1,postorder,0,postorder.length-1,h);
    }
    public static TreeNode construct(int inorder[],int is,int ie,int postorder[],int ps,int pe,HashMap<Integer,Integer> h){
        if(ps>pe ||is>ie) return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int  in=h.get(postorder[pe]);
        int left=in-is;
        root.left=construct(inorder, is, in-1, postorder, ps, ps+left-1, h);
        root.right =construct(inorder,in+1, ie, postorder, ps+left, pe-1, h);
        return root;
        
        
    }
}