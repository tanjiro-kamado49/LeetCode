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
    public ListNode reverseList(ListNode head) {
            if(head==null ||head.next==null) return head;
            
            ListNode second=head.next;
            ListNode new_head=reverseList(second);
            second.next=head;
            head.next=null;
            
            return new_head;
        
    }
}