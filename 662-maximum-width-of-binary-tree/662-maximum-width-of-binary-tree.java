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
    public int widthOfBinaryTree(TreeNode root) {
            if(root==null) return 0;
            Deque<TreeNode>q=new LinkedList<>();
            q.add(root);
            int maxWidth=1;
            while(q.isEmpty()==false){
                    int size=q.size();
                    int left=q.peek().val;
                    int right=left;
                    for(int i=0;i<size;i++){
                            TreeNode node=q.poll();
                            if(node.left!=null){
                                    node.left.val=node.val*2-1;
                                    q.add(node.left);
                            }
                            if(node.right!=null){
                                    node.right.val=node.val*2;
                                    q.add(node.right);
                            }
                            if(i==size-1){
                                    right=node.val;
                            }
                    }
                    maxWidth=Math.max(maxWidth,right-left+1);
            }
            return maxWidth;
        
    }
}