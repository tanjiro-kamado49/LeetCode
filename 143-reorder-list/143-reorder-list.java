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
        public ListNode setTail(ListNode temp,ListNode tail){
                while(temp.next!=tail){
                        temp=temp.next;
                }
                return temp;
        }
    public void reorderList(ListNode head) {
            if(head==null || head.next==null) return ;
            ListNode first=head;
            ListNode second=head.next;
            ListNode temp=head.next;
            ListNode tail=null;
            while(temp.next!=null){
                    temp=temp.next;
            }
            tail=temp;
            temp=head.next;
            while(second!=null){
                    first.next=tail;
                    tail.next=second;
                    tail=setTail(temp,tail);
                    tail.next=null;
                    
                    first=second;
                    second=second.next;
                    temp=temp.next;
            }
        
    }
}