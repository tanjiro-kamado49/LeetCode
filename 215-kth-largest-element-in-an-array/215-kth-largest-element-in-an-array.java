class Solution {
    public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer>p=new PriorityQueue<>();
            for(int i=0;i<nums.length;i++){
                    p.add(nums[i]);
            }
            int ans=0;
            for(int i=0;i<nums.length-k+1;i++){
                    ans=p.poll();
            }
            return ans;
    }
}