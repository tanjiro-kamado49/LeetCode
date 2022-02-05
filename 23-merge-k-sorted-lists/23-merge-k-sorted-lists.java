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
    public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length==0){
                    return null;
            }
            // if(lists[0]==null) return null;
            // int i=0;
            // for( int i=0;i<lists.length)
            ListNode prev=lists[0];
            for(int i=1;i<lists.length;i++){
                    // if(lists[i]==null) continue;
                    ListNode cur=lists[i];
                    prev=merge(prev,cur);
            }
            return prev;
    }
        ListNode merge(ListNode list1, ListNode list2){
              if(list1==null) return list2;
            if(list2==null) return list1;
            
            if(list1.val<=list2.val){
                    list1.next=merge(list1.next,list2);
                    return list1;
            }
            list2.next=merge(list1,list2.next);
            return list2;
                
                
                
        }
//         int lengthList(ListNode head){
//                 ListNode temp=head;
//                 int l=0;
//                 while(temp!=null){
//                         l++;
//                         temp=temp.next;
//                 }
//                 return l;
                
//         }
}