class Solution {
    public int minSubArrayLen(int target, int[] nums) {
           int res=Integer.MAX_VALUE;
           int sum=0;
           int r=0;
           int l=0;
            for(r=0;r<nums.length;r++){
                   sum=sum+nums[r];
                    if(sum>=target){
                            res=Math.min(res,r-l+1);
                    }
                   while(l<r){
                           if(sum-nums[l]>=target){
                                   sum=sum-nums[l];
                                   l++;
                                    res=Math.min(res,r-l+1);
                           }
                           else{
                                   break;
                           }
                           
                   }
            }
            if(res==Integer.MAX_VALUE){
                    return 0;
            }
            return res;
    }
}