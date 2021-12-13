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
        ListNode head1=null;
        public ListNode insert(ListNode list, int data)
    {
        // Create a new node with given data
        ListNode new_node = new ListNode(data);
        new_node.next = null;
   
        // If the Linked List is empty,
        // then make the new node as head
        if (head1 == null) {
            head1 = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            ListNode last = head1;
            while (last.next != null) {
                last = last.next;
            }
   
            // Insert the new_node at last node
            last.next = new_node;
        }
   
        // Return the list by head
        return list;
    }
    public ListNode deleteDuplicates(ListNode head) {
            HashMap<Integer,Integer>hm=new HashMap<>();
            ListNode temp=head;
            while(temp!=null){
                    if(hm.containsKey(temp.val)==true)
                            hm.put(temp.val,hm.get(temp.val)+1);
                    else
                            hm.put(temp.val,1);
                    temp=temp.next;
            }
            List<Integer>arr=new ArrayList<>();
              for(Map.Entry m : hm.entrySet()){    
                   if((int)m.getValue()==1){
                           arr.add((int)m.getKey());
                   }     
              }
            System.out.println(arr);
            Collections.sort(arr);
           ListNode list = new ListNode();
            for(int i=0;i<arr.size();i++){
                    list=insert(head1,  arr.get(i));
               
                    
            }
            
            return head1;
        
    }
}