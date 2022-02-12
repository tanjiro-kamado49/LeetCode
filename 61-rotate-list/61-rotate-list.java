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
    public ListNode rotateRight(ListNode head, int k) {
            // "l" length of list..
            ListNode temp=head;
            int l=0;
            while(temp!=null){
                    l++;
                    temp=temp.next;
            }
            
            //k%listlength==0
            // return head
            if(head==null|| k==0|| k%l==0){
                    return head;
            }
            
            //k>l then k=k%l
            if(k>l){
                    k=k%l;
            }
            
            //new head
            ListNode newHead=head;
            ListNode prev=head;
            //new head will point to "l-k+1" and prev to" l-k"
            for(int i=0;i<l-k-1;i++){
                    prev=prev.next;
            }
            // System.out.println("prev.val "+prev.val);
            newHead=prev.next;
            ListNode tail=newHead;
            // System.out.println("newhead.val "+newHead.val);
            
            //tail pointer pont to last node
            while(tail.next!=null){
                    tail=tail.next;
            }
            // System.out.println("tail.val "+tail.val);
            
            
            prev.next=null;
            tail.next=head;
            head=newHead;
            return head;      
                    
        
    }
}