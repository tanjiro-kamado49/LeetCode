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
    ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode second=head.next;
        ListNode newhead=reverse(head.next);
        second.next=head;
        head.next=null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode dummy=reverse(slow);
        while(dummy!=null){
            if(head.val!=dummy.val) return false;
            dummy=dummy.next;
            head=head.next;
        }
        return true;
        
        
    }
}