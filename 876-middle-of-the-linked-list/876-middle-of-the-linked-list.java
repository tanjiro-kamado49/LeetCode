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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int mid=(len+1)/2;
        if(len%2==0) mid++;
        ListNode new_head=head;
        for(int i=0;i<mid-1;i++){
            new_head=new_head.next;
            
        }
        return new_head;
        
    }
}