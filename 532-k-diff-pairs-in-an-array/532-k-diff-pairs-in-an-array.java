class Solution {
    public int findPairs(int[] nums, int k) {
            HashMap<Integer,Integer>hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                    hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            int count=0;
             for (int num: hm.keySet()){
                     if(k==0){
                             if(hm.get(num)>=2){
                                     count++;
                             }
                     }
                     else{
                             if(hm.containsKey(num-k)){
                                     count++;
                             }
                     }
             }
            return count;
        
    }
}