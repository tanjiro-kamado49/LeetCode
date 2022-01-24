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
    public ListNode deleteDuplicates(ListNode head) {
            ListNode sentinel =new ListNode(0,head);
            ListNode pred=sentinel;
            while(head!=null){
                    //System.out.println("head---"+head.val);
                    //System.out.println("pred---"+pred.val);
                    //System.out.println("sentinel.next-----"+sentinel.next.val);
                    if(head.next!=null && head.val==head.next.val){
                            
                            while(head.next!=null && head.next.val==head.val){
                                    //System.out.println("head---"+head.val);
                                    head=head.next;
                            }
                            pred.next=head.next;
                            //System.out.println("pred.next---"+pred.val);
                    }
                    else{   
                            pred=pred.next;
                            //System.out.println("pred---"+pred.val);
                    }
                    
                    head=head.next;
                     //System.out.println("---------------------------");
                    
            }
        return sentinel.next;
    }
}