/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
            if(head==null) return null;
            ListNode hare= head;
            ListNode tortise=head;
            while(hare!=null && hare.next!=null){
                    hare=hare.next.next;
                    tortise=tortise.next;
                    if(hare==tortise){
                            tortise=head;
                            while(tortise!=hare){
                                    tortise=tortise.next;
                                    hare=hare.next;
                            }
                            return tortise;
                    }
                 
            }
            return null;
        
    }
}