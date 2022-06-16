    class pair{
    int val, min;
    pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}
class MinStack {
    Stack<pair>s;

    public MinStack() {
        s=new Stack<>();
        
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.add(new pair(val,val));
        }
        else{
            // int min=Integre.MAX_VALUE;
            if(s.peek().min<val){
                s.push(new pair(val,s.peek().min));
                
            }
            else{
                s.push(new pair(val,val));
            }
        }
        
        
    }
    
    public void pop() {
        s.pop();
        
    }
    
    public int top() {
        return s.peek().val;
        
    }
    
    public int getMin() {
        return s.peek().min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */