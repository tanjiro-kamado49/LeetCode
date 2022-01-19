class Solution {
    public int dominantIndex(int[] nums) {
            int n=nums.length;
            if(n==1) return 0;
            int maxValue=0;
            int maxInd=0;
            for(int i=0;i<n;i++){
                    if(nums[i]>maxValue){
                            maxValue=nums[i];
                            maxInd=i;
                    }
            }
            for(int i=0;i<n;i++){
                    if(i!=maxInd){
                            if(nums[i]*2>maxValue) return -1;
                    }
            }
            return maxInd;
        
    }
}