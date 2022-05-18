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
        HashSet<ListNode>set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        ListNode l2=headB;
        while(l2!=null){
            if(set.contains(l2)==true) return l2;
            l2=l2.next;
        }
        return null;
    }
}