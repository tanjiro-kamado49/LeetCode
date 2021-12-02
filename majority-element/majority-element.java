class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int v=0;
        for(int i=0;i<nums.length;i++){
            if(v==0){
                v++;
                c=nums[i];
            }else{
                if(c==nums[i]){
                    v++;
                }else{
                    v--;
                }
            }
        }
        return c;
        
    }
}