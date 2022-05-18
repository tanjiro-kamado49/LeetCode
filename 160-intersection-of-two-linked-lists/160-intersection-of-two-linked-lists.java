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
        int l1=0;
        int l2=0;
        ListNode d1=headA;
        ListNode d2=headB;
        while(d1!=null || d2!=null){
            if(d1!=null){
                d1=d1.next;
                l1++;
            }
            if(d2!=null){
                d2=d2.next;
                l2++;
            }
        }
        int diff=Math.abs(l1-l2);
        d1=headA;
        d2=headB;
        if(l1>l2){
            ListNode temp=d1;
            d1=d2;
            d2=temp;
        }
        for(int i=0;i<diff;i++){
            d2=d2.next;
        }
        while(d1!=null && d2!=null){
            if(d1==d2)return d1;
            d1=d1.next;
            d2=d2.next;
        }
        return null;
    }
}