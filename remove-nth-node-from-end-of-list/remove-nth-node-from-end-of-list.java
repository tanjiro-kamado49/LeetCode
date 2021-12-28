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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=0;
        ListNode cur=head;
        ListNode temp=new ListNode();
        while(cur!=null){
            l++;
            cur=cur.next;
        }
        int rest=l-n;
        if(rest==0){
            return head.next;
        }
        cur=head;
        l=0;
        while(cur!=null){
            if(l==rest-1){
                temp=cur;
            }
            if(l==rest){
                temp.next=cur.next;
                return head;
            }
            l++;
            cur=cur.next;
        }
        return head;       
        
    }
}