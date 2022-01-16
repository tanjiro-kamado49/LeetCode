class Solution {
        int BinarySearch(int[]nums,int k,boolean flag){
                int index=-1;
                int s=0;
                int e=nums.length-1;
                while(s<=e){
                        int mid=s+(e-s)/2;
                        if(flag==true){
                             if(nums[mid]>=k) e=mid+-1;
                                else s=mid+1;
                        }
                        else{
                                if(nums[mid]<=k) s=mid+1;
                                else e=mid-1;
                        }
                        if (nums[mid]==k) index = mid;
                }
                return index;
        }
    public int[] searchRange(int[] nums, int target) {
            int ans[]=new int[2];
          ans[0]=BinarySearch(nums,target,true);
            ans[1]=BinarySearch(nums,target,false);
            return ans;
            
        
    }
}