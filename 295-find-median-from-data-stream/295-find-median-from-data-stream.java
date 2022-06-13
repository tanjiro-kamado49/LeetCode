class MedianFinder {
    PriorityQueue<Integer> min;
   PriorityQueue<Integer> max;

    public MedianFinder() {
       min= new PriorityQueue<Integer>();
       max=new PriorityQueue<Integer>((a,b)->b-a);
        
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek()>=num) max.add(num);
        else min.add(num);
        if(max.size()-min.size()>1){
            min.add(max.poll());
        }
        if(min.size()-max.size()>1){
            max.add(min.poll());
        }
        
    }
    
    public double findMedian() {
        double ans=0.0;
        if(max.size()==min.size()) {
            // System.out.println(max.peek()+" "+min.peek());
            ans=(double)(max.peek()+min.peek());
            return ans/2;
        }
        // if(max)
        if(max.size()>min.size()){
            ans=(double)max.peek();
        }
        else
            ans=(double)min.peek();
        return ans;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */