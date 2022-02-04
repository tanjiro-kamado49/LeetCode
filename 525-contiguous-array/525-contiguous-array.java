class Solution {
    public int findMaxLength(int[] nums) {
            HashMap<Integer,Integer>hm=new HashMap<>();
            hm.put(0,-1);
            int res=0;
            int prefix=0;
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                            nums[i]=-1;
                    }
                    prefix+=nums[i];
                    if(hm.containsKey(prefix)==false){
                            hm.put(prefix,i);
                    }
                    res=Math.max(res,i-hm.get(prefix));
                    
            }
            return res;
        
    }
}