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
public class iterator{
    private Stack<TreeNode>s=new Stack<>();
    boolean reverse;
    public iterator(TreeNode root,boolean reverse){
        this.reverse=reverse;
        pushAll(root);
    }
    public void pushAll(TreeNode root){
        while(root!=null){
            s.push(root);
            if(reverse==false) root=root.left;
            else root=root.right;
        }
    }
    public int next(){
        TreeNode node=s.pop();
        if(reverse==true) pushAll(node.left);
        else pushAll(node.right);
        return node.val;
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        iterator l=new iterator(root,false);
        iterator r=new iterator(root,true);
        int i=l.next();
        int j=r.next();
        while(i<j){
            if(i+j==k) return true;
            else if(i+j<k) i=l.next();
            else j=r.next();
        }
        return false;
        
    }
}