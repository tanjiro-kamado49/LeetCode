class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1) return;
            int i=nums.length-2;
            while(i>=0 && nums[i]>=nums[i+1])i--;
            if(i>=0){
                    int j=nums.length-1;
                    while(j>=0 && nums[j]<=nums[i])  j--;
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
            }
            int s=i+1;
            int l=nums.length-1;
            while(s<l){
                    int temp=nums[s];
                    nums[s]=nums[l];
                    nums[l]=temp;
                    s++;
                    l--;
            }
            
        
    }
}