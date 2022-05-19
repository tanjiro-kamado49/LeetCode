/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>hm=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            hm.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp=head;
        Node nhead=null;
        
        while(temp!=null){
           
            Node clone=hm.get(temp);
             if(temp==head){
                 nhead=clone;      
            }
            Node nextnode=null;
            if(temp.next!=null){
                nextnode=hm.get(temp.next);
                
            }
            Node randomNode=null;
            if(temp.random!=null){
                randomNode=hm.get(temp.random);
            }
            
            clone.next=nextnode;
            clone.random=randomNode;
            temp=temp.next;
        }
        return nhead;
        
    }
}