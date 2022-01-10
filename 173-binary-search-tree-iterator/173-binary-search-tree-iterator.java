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
class BSTIterator {
        List<Integer>in=new ArrayList<>();
        public void  inorder(List<Integer>in,TreeNode root){
               if(root!=null){
                    inorder(in,root.left);
                     in.add(root.val);
                    inorder(in,root.right);
               }
        }

    public BSTIterator(TreeNode root) { 
            //Queue<TreeNode>q=new LinkedList<>();
            if(root==null){
                    in.add(null);
            }
            inorder(in,root);
        
    }
    
    public int next() {
           int x=in.remove(0).intValue();
            return x;
            
        
    }
    
    public boolean hasNext() {
            if(in.isEmpty()==true) return false;
            return true;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */