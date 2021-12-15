/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
            
            if(head==null) return null;
            ListNode h1=head;
            int count=0;
            HashMap<ListNode,Integer>hm=new HashMap<>();
            while(h1!=null){
                    if(hm.containsKey(h1)){
                            return h1;
                            
                    }
                    else{
                            hm.put(h1,count);
                    }
                    count++;
                    h1=h1.next;
                    
            }
            return null;
                  
            
        
    }
}