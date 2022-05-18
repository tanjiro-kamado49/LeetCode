/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cr1=headA;
        while(cr1!=null){
           ListNode cur2=headB;
            while(cur2!=null){
                if(cur2==cr1) return cur2;
                cur2=cur2.next;
            }
            cr1=cr1.next;
        }
        return null;
        
    }
}