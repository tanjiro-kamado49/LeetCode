class MyLinkedList {
        
        Node head;
        Node tail;

    public MyLinkedList() {
           //head=new Node();
         //tail=new Node();
            head=null;
            tail=null;
            //size=0;
        
    }
    
    public int get(int index) {
            int size=size();
            if(index>=size) return -1;
            ;
            Node temp=this.head;
            for(int i=0;i<index&& temp!=null;i++) temp=temp.next;
            return temp.val;
    }
    
    public void addAtHead(int val) {
            Node new_node=new Node(val);
            if(head==null){
                    new_node.next=null;
                    this.head=new_node;
                    this.tail=this.head;
            }
            else{
                    new_node.next=this.head;
                    this.head=new_node;
            }
        
    }
    
    public void addAtTail(int val) {
            Node new_node=new Node(val);
            if(head==null){
                    new_node.next=null;
                    this.head=new_node;
                    this.tail=this.head;
            }
            else{
                    tail.next=new_node;
                    tail=new_node;
                    new_node.next=null;
            }

            
        
    }
    
    public void addAtIndex(int index, int val) {
            int size=size();
            if(index>size) return ;
            Node node=new Node(val);
            if(index==0){
                      node.next=head;
                      head=node;
            }
            else if(index==size) {
                 tail.next=node;
                 node.next=null;
                 tail=node;
            }
            else if(index>size){
               return;
            }
            else{
                    Node temp=head;
                    for(int i=0;i<index-1;i++){
                      temp=temp.next;
                     }
                    Node nextnode=temp.next;
                    temp.next=node;
                    node.next=nextnode;
                    
                    
            }
    }
    
    public void deleteAtIndex(int index) {
            int size=size();
            if(index==0){
                    head=head.next;
                    
            }
            else if(index==size-1){
                    Node temp=head;
                    for(int i=0;i<size-2;i++) temp=temp.next;
                    temp.next=null;
                    tail=temp;
            }
            else if(index>=size) return ;
            else{
                      Node temp=head;
                  for(int i=0;i<=index-2;i++){
                      temp=temp.next;
                    }
            temp.next=temp.next.next;
            }
            
    }
    public int size(){
    Node temp=head;
     int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
class Node{
                int val;
                Node next;
                Node(int val){
                        this.val=val;
                }
        }
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */