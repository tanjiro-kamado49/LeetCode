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
        public static int length(ListNode h1){
                if(h1==null) return 0;
                int count=0;
                while(h1!=null){
                        h1=h1.next;
                        count++;
                }
                
                return count;
        }
   ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    public void reorderList(ListNode head) {
            ListNode temp=head;
            int len=length(head);
            for(int i=0;i<len-2;i++){
                    
                    ListNode x=reverse(temp.next);
                    temp.next=x;
                    temp=temp.next;
                    
            }
            //return head;
            
        
    }
}