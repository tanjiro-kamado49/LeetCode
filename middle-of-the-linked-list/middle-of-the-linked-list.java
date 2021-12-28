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
        int n=0;
        ListNode temp=head;
        //if(head.next==null){
          //  return head;
        //}
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int m=0;
        if(n%2!=0){
            m=(n+1)/2;
        }
        else{
            m=n/2;
            m+=1;
        }
        ListNode cur=head;
        //System.out.println(m);
        for(int i=1;i<m;i++){
            cur=cur.next;
            
        }
        //System.out.println(cur.val);
        head=cur;
        return  head;
    }
}