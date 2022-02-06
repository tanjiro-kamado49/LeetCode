class Solution {
    public int removeDuplicates(int[] nums) {
            if(nums.length==1 || nums.length==2) return nums.length;
            int idx=0; //defines index for expectedNums
            int cur=nums[0];
            int count=0;
            for(int i=0;i<nums.length;i++){
                    if(cur==nums[i] && count>=2){
                            count++;
                    }
                    if(cur==nums[i] && count<2){
                            count++;
                            nums[idx++]=nums[i];
                    }
                    if(cur!=nums[i]){
                            count=1;
                            cur=nums[i];
                            nums[idx++]=nums[i];
                    }
            }
            return idx;
            
            
    }
}