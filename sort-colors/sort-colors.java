class Solution {
     public void swap(int[]nums,int x,int y){
        int temp;
        temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void sortColors(int[] nums) {
         int l=0,m=0,r=nums.length-1;
        while(m<=r){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums,m,r);
                r--;
            }
        }
        
    }
}