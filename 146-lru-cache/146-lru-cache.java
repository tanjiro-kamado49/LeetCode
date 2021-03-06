
class LRUCache {
    class node{
    int key;
    int val;
    node next;
    node prev;
    node(int key,int val){
        this.key=key;
        this.val=val;
    }
    
}
    int cap;
    node head=new node(-1,-1);
    node tail=new node(-1,-1);
    
    HashMap<Integer,node>hm=new HashMap<>();

    public LRUCache(int capacity) {
        this.cap=capacity;
        head.next=tail;
        tail.prev=head;     
    }
    void addnode(node nn){
        // node nn=new node(key,val);
        node ne=head.next;
        head.next=nn;
        nn.prev=head;
        nn.next=ne;
        ne.prev=nn;
        hm.put(nn.key,nn);
    }
    public  void  delete(node x){
        node prev=x.prev;
        prev.next=x.next;
        x.next.prev=prev;
        
    }
    
    public int get(int key) {
        if(hm.containsKey(key)==false) return -1;
        else{
            node data=hm.get(key);
            // if(data.prev==head) return data.val;
            hm.remove(key);
            delete(data);
            addnode(data);
            // System.out.println("tail"+tail.prev.key);
            //  System.out.println("head"+head.next.key);
            return data.val;
        }
        // return -1;
        
        
    }
    
    public void put(int key, int value) { 
        if(hm.containsKey(key)){
               delete(hm.get(key));
               hm.remove(key);
        }
        if(hm.size()<cap){
            addnode(new node(key,value));
            
        }
        else{ 
              hm.remove(tail.prev.key);
              delete(tail.prev);
              addnode(new node(key,value));
        }
        
         
    }
        
        
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */