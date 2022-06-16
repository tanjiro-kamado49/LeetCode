class LFUCache {
    class Node{
        int key,val,cnt;
        Node prev,next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
            cnt=1;
        }
    }
    
    class List{
        int size;
        Node head,tail;
        List(){
            head=new Node(0,0);
            tail=new Node(0,0);
            head.next=tail;
            tail.prev=head;
            size=0;
        }
        public void addNode(Node node){
            Node temp=head.next;
            head.next=node;
            node.prev=head;
            node.next=temp;
            temp.prev=node;
            size++;
        }
       public void  deleteNode(Node node){
            Node pp=node.prev;
            pp.next=node.next;
            node.next.prev=pp;
            size--;
        }
    }
    HashMap<Integer,Node>keyNode=new HashMap<>();
    HashMap<Integer ,List>freqList=new HashMap<>();
    int maxsize;
    int minFreq;
    int cursize;
    

    public LFUCache(int capacity) {
        maxsize=capacity;
        minFreq=0;
        cursize=0;
        
    }
    public void updatefreqListMap(Node node){
        keyNode.remove(node.key);
        freqList.get(node.cnt).deleteNode(node);
        if(node.cnt==minFreq && freqList.get(node.cnt).size==0){
            minFreq++;
        }
        List nexthigh=new List();
        if(freqList.containsKey(node.cnt+1)){
            nexthigh=freqList.get(node.cnt+1);
        }
        node.cnt++;
        nexthigh.addNode(node);
        freqList.put(node.cnt,nexthigh);
        keyNode.put(node.key,node);
        
    }
    
    public int get(int key) {
        if(keyNode.containsKey(key)){
            Node node=keyNode.get(key);
            updatefreqListMap(node);
            return node.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(maxsize==0) return;
        if(keyNode.containsKey(key)){
            Node node=keyNode.get(key);
            node.val=value;
            updatefreqListMap(node);
        }
        else{
            if(cursize==maxsize){
                List list=freqList.get(minFreq);
                keyNode.remove(list.tail.prev.key);
                freqList.get(minFreq).deleteNode(list.tail.prev);
                cursize--;
                
            }
            cursize++;
            minFreq=1;
            List list=new List();
            if(freqList.containsKey(minFreq)){
                list=freqList.get(minFreq);
            }
            Node node=new Node(key,value);
            list.addNode(node);
            keyNode.put(key,node);
            freqList.put(minFreq,list);
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */