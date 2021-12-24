class Solution {
    static int binarySearch(int []nums,int target,int s,int e){
        int mid=s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target)
            return binarySearch(nums,target,mid+1,e);
        else
            return binarySearch(nums,target,s,mid-1);
    }
    public int search(int[] nums, int target) {
       int ans= binarySearch(nums,target,0,nums.length-1);
        return ans;
    }
}