class Solution {
    public List<Integer> findLonely(int[] nums) {
            HashMap<Integer,Integer>hm=new HashMap<>();
             List<Integer>ans=new ArrayList<>();
            if(nums.length==0) return ans;
            for(int i=0;i<nums.length;i++){
                    hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            for (Map.Entry mapElement : hm.entrySet()) {
                      int key = (int)mapElement.getKey();
                    if((int)mapElement.getValue()>1 ||hm.containsKey(key-1) ||hm.containsKey(key+1)) continue;
                    else  ans.add(key);
 
        }
            return ans;
    }
}