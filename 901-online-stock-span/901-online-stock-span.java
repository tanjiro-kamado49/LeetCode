class StockSpanner {
    class pair{
        int val;
        int consfreq;
        pair(int val,int consfreq){
            this.val=val;
            this.consfreq=consfreq;
        }
        
    }
    Stack<pair>s;

    public StockSpanner() {
        s=new Stack<>();
        
    }
    
    public int next(int price) {
        int cost=1;
        while(s.isEmpty()==false && s.peek().val<=price){
            cost+=s.pop().consfreq;
        }
        s.push(new pair(price,cost));
        return cost;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */