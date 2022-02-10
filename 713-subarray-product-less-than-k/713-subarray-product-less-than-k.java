class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
            int l=0;
            int r=0;
            int mul=1;
            int count=0;
            if(k==0) return 0;
            for(r=0;r<nums.length;r++){
                    mul*=nums[r];
                    if(mul<k){
                            count+=r-l+1;
                    }
                    else{
                           while(mul>=k && l<r){
                            mul=mul/nums[l];
                            l++;
                            
                          }
                            if(mul<k){
                                    count+=r-l+1;
                            }
                            
                    }
                  
                   
                    
            }
            return count;
        
    }
}