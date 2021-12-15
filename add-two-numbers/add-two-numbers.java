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
        public static int length(ListNode t){
                if(t==null){
                        return 0;
                }
                int count=0;
                while(t!=null){
                        t=t.next;
                        count++;
                }
                return count;
        }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp1=l1;
            ListNode head=l1;
            ListNode temp2=l2;
            int length1=length(l1);
            int length2=length(l2);
            if(length1 <length2){
                    ListNode x=temp1;
                    temp1=temp2;
                    temp2=x;
                    head=temp1;
            }
            int carry=0;
            while(temp2!=null && temp1!=null){
                    int sum=temp1.val+temp2.val+carry;
                    if(sum>9){
                            sum=sum%10;
                            carry =1;
                    }
                    else{
                            carry=0;
                    }
                    temp1.val=sum;
                    temp1=temp1.next;
                    temp2=temp2.next;
                    
            }
            while(temp1!=null){
                    int sum=temp1.val+carry;
                     if(sum>9){
                            sum=sum%10;
                            carry =1;
                    }
                    else{
                            carry=0;
                    }
                    temp1.val=sum;
                    temp1=temp1.next;
                    
            }
            if(carry==1){
                    ListNode newnode=new ListNode(1);
                    temp1=head;
                    while(temp1.next!=null){
                            temp1=temp1.next;
                            
                    }
                    temp1.next=newnode;
                    newnode.next=null;
            }
            return head;
            
         
        
    }
}