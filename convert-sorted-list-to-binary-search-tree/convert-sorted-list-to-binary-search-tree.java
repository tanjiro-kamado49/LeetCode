/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
   TreeNode createTree(List<Integer>arr,int s,int e){
            if(s>e)
            return null;
          
             int m=s+(e-s)/2;
             TreeNode root=new TreeNode(arr.get(m));
             root.left=createTree(arr,s,m-1);
             root.right=createTree(arr,m+1,e);
                   
           return root;
   }
    public TreeNode sortedListToBST(ListNode head) {
            List<Integer>arr=new ArrayList<>();
            while(head!=null){
                    arr.add(head.val);
                    head=head.next;
            }
            return createTree(arr,0,arr.size()-1);
        
    }
}