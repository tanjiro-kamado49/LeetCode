class MinStack {
    Stack<Long>s=new Stack<>();
    Long min;

    public MinStack() {
        min=Long.MAX_VALUE;
        
    }
    
    public void push(int val) {
        Long value=Long.valueOf(val);
        if(s.isEmpty()){
            s.push(value);
            min=value;
            return;
        }
        
            if(value<min){
                s.push(2*value-min);
                min=value;
            }
            else{
                s.push(value);
            }
        
        
    }
    
    public void pop() {
        Long x=s.pop();
        if(x<min){
            min=2*min-x;
        }
        
        
    }
    
    public int top() {
        Long val=s.peek();
        if(val<min) return min.intValue();
        else return val.intValue();
        
    }
    
    public int getMin() {
        return min.intValue();
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