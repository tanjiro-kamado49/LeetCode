class MedianFinder {
    PriorityQueue<Integer>min;
    PriorityQueue<Integer>max;

    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>((a,b)->b-a);
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek()>=num) max.add(num);
        else min.add(num);
        if(max.size()-min.size()>1) min.add(max.poll());
        if(min.size()>max.size()) max.add(min.poll());
        
    }
    
    public double findMedian() {
        double ans=0.0;
        if(max.size()==min.size()) {
            ans=(max.peek()+min.peek())/2.0;
            return ans;
        }
        return (double) max.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */