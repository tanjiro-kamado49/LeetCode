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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
            int s=0;
            int l=0;
            ListNode left =head;
            for(int i=1;i<k;i++){
                    left=left.next;
            }
            ListNode right=head;
            ListNode pn =left;
            while(pn.next!=null){
                    right=right.next;
                    pn=pn.next;
                    
            }

            int x=left.val;
            left.val=right.val;
            right.val=x;
            return head;
            
        
    }
}