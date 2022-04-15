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
            int s=0;
            int l=0;
            ListNode temp=head;
            while(temp!=null){
                    temp=temp.next;
                    l++;
            }
            int e=l-k;
            ListNode left=head;
            ListNode right=head;
            while(s!=k-1){
                    left=left.next;
                    s++;
            }
            while(e!=0){
                    right=right.next;
                    e--;
                    
            }
            System.out.println(left.val);
            int x=left.val;
            left.val=right.val;
            right.val=x;
            return head;
            
        
    }
}