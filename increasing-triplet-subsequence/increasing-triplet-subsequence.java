class Solution {
    public boolean increasingTriplet(int[] nums) {
          int n=nums.length;
           if(n<3){
               return false;
            }
        
          int []left=new int[n];
          int []right=new int[n];
          left[0]=nums[0];
            for(int i=1;i<n;i++){
                   if(left[i-1]<nums[i]) 
                           left[i]=left[i-1];
                    else
                            left[i]=nums[i];
                            
            }
            right[n-1]=nums[n-1];
            for(int i=n-2;i>=0;i--){
                    if(right[i+1]<nums[i]) 
                            right[i]=nums[i];
                    else
                            right[i]=right[i+1];
            }
            for(int i=1;i<n-1;i++){
                    if(left[i-1]<nums[i]){
                            if(right[i+1]>nums[i]){
                                    return true;
                            }
                    }
            }
            return false;
        
    }
}