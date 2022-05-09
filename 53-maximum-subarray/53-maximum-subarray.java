class Solution {
    public int maxSubArray(int[] nums) {
            int cur=0;
            int res=0;
            int i=0;
            // if(nums.length==1) return nums[0];
            while(i<nums.length){
                    if(nums[i]<0) i++;
                    else break;
                   
            }
            int max=Integer.MIN_VALUE;
            if(i==nums.length){
                    for(int k=0;k<nums.length;k++) max=Math.max(nums[k],max);
                    return max;
            }
            while(i<nums.length){
                    cur+=nums[i];
                    if(cur>res) res=cur;
                    if(cur<0) cur=0;
                    i++;
            }
            return res;
         
    }
}