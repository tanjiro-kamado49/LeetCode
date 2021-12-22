class MinStack {
        Stack<Integer>s;
        int min;
    public MinStack() {
           s=new Stack<Integer>();
            min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
            s.push(val);
            min=Math.min(min,val);
        
    }
    
    public void pop() {
            if(s.isEmpty()==true) return ;
            int data=s.pop();
            if(min==data){
                     min=Integer.MAX_VALUE;
                    Stack<Integer>temp=new Stack<>();
                    while(s.isEmpty()==false){
                            int value=s.pop();
                            //System.out.println("min  "+min+"value"+value);
                            min=Math.min(min,value);
                            //System.out.println("min"+min);
                            temp.push(value);
                    }
                     while(temp.isEmpty()==false){
                            int value=temp.pop();
                            s.push(value);
                    }
            }
        
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
            return min;
        
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