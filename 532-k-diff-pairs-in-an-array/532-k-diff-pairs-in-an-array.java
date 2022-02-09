class Solution {
    public int findPairs(int[] nums, int k) {
            Arrays.sort(nums);
            int count=0;
            for(int i=0;i<nums.length;i++){
                    if(i>0 && nums[i]==nums[i-1]) continue;
                    if(binarysearch(nums,i+1,nums[i]+k)!=-1){
                            count++;
                    }
            }
            return count;
        
    }
        int binarysearch(int []nums,int s,int target){
                int e=nums.length-1;
                while(s<=e){
                        int mid=s+(e-s)/2;
                        if(nums[mid]==target) return 1;
                        else if(target>nums[mid])s=mid+1 ;
                        else e=mid-1;
                }
                return -1;
        }
}