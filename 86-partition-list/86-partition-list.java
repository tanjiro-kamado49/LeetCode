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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode low=dummy;
        ListNode forward=dummy;
        while(forward.next!=null){
            if(forward.next.val>=x){
                forward=forward.next;
                // System.out.println("greater"+low.next.val);
                continue;
            }
            if(forward==low) {
                low=low.next;
                forward=forward.next;
                 // System.out.println("equal"+low.next.val);
                continue;
            }
            ListNode node=forward.next;
            // ListNode forward_next=forward.next.next;
            forward.next=forward.next.next;
            ListNode next=low.next;
            low.next=node;
            node.next=next;
            low=low.next;
        }
        return dummy.next;
        
    }
}