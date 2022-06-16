class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        int id=0;
        Deque<Integer>d=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(d.isEmpty()==false && d.peekFirst()==i-k){
                d.removeFirst();
            }
            while(d.isEmpty()==false && nums[d.peekLast()]<nums[i]){
                // System.out.println("Remove- "+d.peekLast()+" by nums[i]- "+nums[i]);
                d.removeLast();
            }
            d.addLast(i);
            // System.out.println(d.peekFirst());
            if(i>=k-1){
                ans[id++]=nums[d.peekFirst()];
                // System.out.println(d.peekFirst());
                
            }
        }
        return ans; 
        
    }
}