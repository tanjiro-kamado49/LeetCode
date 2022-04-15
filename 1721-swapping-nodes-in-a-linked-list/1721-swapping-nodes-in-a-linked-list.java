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
    public ListNode swapNodes(ListNode head, int k) {
            ListNode dummy=new ListNode(0);
            dummy.next=head;
            ListNode preleft=dummy;
            ListNode preright=dummy;
            ListNode left=head;
            ListNode right=head;
            for(int i=1;i<k;i++){
                    preleft=preleft.next;
                    left=left.next;
            }
            ListNode pn=left;
            while(pn.next!=null){
                    preright=preright.next;
                    right=right.next;
                    pn=pn.next;
            }
            ListNode templ=left.next;
            ListNode tempr=right.next;
            if(preleft==right){
                    preright.next=left;
                    left.next=right;
                    right.next=templ;
            }
            else if(left==preright){
                    preleft.next=right;
                    right.next=left;
                    left.next=tempr;
            }
            else{
                    preleft.next=right;
                    right.next=templ;
                    preright.next=left;
                    left.next=tempr;
                    
            }
            return dummy.next;
        
    }
}