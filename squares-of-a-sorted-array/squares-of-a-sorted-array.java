class Solution {
    public int[] sortedSquares(int[] nums) {
        int e=nums.length-1;
        int s=0;
        int cur=e;
        int []ans=new int[nums.length];
        while(s<=e && cur>=0){
            if(Math.abs(nums[s])<Math.abs(nums[e])){
                ans[cur]=nums[e]*nums[e];
                cur--;
                e--;
            }
            else{
                ans[cur]=nums[s]*nums[s];
                cur--;
                s++;
                
            }
        }
        return ans;
       
    }
}