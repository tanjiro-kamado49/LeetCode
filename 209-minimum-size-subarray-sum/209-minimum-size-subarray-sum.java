class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int e=0;
            int s=0;
            int cl=0;
            int cs=0;
            int min_length=Integer.MAX_VALUE;
            boolean found=false;
            while(e<nums.length){
                    cs+=nums[e++];
                    cl++;
                    while(cs>=target){
                            cs-=nums[s++];
                            min_length=Math.min(min_length,cl);
                            cl--;
                            found=true;
                    }
                    
            }
            if(!found) return 0;
            return min_length;
        
    }
}