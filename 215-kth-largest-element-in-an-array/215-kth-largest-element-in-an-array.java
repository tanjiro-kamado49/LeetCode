class Solution {
    public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            int ans=0;
            for(int i=nums.length-1;i>nums.length-k-1;i--){
                    ans=nums[i];
            }
            return ans;
        
    }
}