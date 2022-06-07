class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        // int n=nums.length;
        if(high==0) return nums[0];
        else if(nums[low]!=nums[low+1])  return nums[low];
        else if(nums[high]!=nums[high-1]) return nums[high];
        while(low<=high){
            int mid=(low+high)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            if(mid%2!=0){
                if(nums[mid]==nums[mid-1]) low=mid+1;
                else high=mid-1;
            }
        }
        return nums[low];
        
    }
}