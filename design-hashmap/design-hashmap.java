class MyHashMap {
        HashMap<Integer,Integer>ans;

    /** Initialize your data structure here. */
    public MyHashMap() {
        ans=new HashMap<>();
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        ans.put(key,value);
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
            if(ans.containsKey(key)==false) return -1;
        return ans.get(key);
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
             if(ans.containsKey(key)==false) return ;
         ans.remove(key);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */