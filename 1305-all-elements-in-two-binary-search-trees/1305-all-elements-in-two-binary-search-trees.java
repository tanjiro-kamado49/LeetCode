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
        public void inorder( List<Integer> arr,TreeNode root){
                if(root!=null){
                        inorder(arr,root.left);
                        arr.add(root.val);
                        inorder(arr,root.right);
                        
                }
        }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>a=new ArrayList<>();
            List<Integer>b=new ArrayList<>();
            inorder(a,root1);
            inorder(b,root2);
            int i=0;
            int j=0;
            List<Integer> ans=new ArrayList<>();
            while(i<a.size() && j<b.size()){
                   if(a.get(i)>b.get(j)){
                           ans.add(b.get(j));
                           j++;
                   }
                    else{
                            ans.add(a.get(i));
                            i++;
                    }
                    
            }
             while(i<a.size()){
                            ans.add(a.get(i++));
            }
            while(j<b.size()){
                    ans.add(b.get(j++));
            }
            return ans;
            
    }
}