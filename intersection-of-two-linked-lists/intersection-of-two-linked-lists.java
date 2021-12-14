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
        public static  int length(ListNode node){
                ListNode temp=node;
                int count=0;
                while(temp!=null){
                        count++;
                        temp=temp.next;
                }
                return count;
                
        }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int l1=length(headA);
            int l2=length(headB);
            int diff=Math.abs(l1-l2);
            ListNode list1=headA;
            ListNode list2=headB;
            if(l1<l2){
                    ListNode temp=list1;
                    list1=list2;
                    list2=temp;
            }
            for(int i=0;i<diff;i++){
                    list1=list1.next;
            }
            while(list1!=null && list2!=null){
                    if(list1==list2) return list1;
                    list1=list1.next;
                    list2=list2.next;
            }
            return null;
            
        
    }
}