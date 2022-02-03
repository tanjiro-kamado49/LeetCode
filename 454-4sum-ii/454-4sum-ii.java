class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            HashMap<Integer,Integer>hm= new HashMap<>();
            for(int i:nums1){
                    for(int j:nums2){
                            if(hm.containsKey(i+j)==true){
                                    hm.put(i+j,hm.get(i+j)+1);
                            }
                            else{
                                    hm.put(i+j,1);
                            }
                    }
            }
            int count=0;
            for(int k:nums3){
                    for(int l:nums4){
                            if(hm.containsKey(-(k+l))==true){
                                    count+=hm.get(-(k+l));
                            }
                    }
            }
            return count;
        
    }
}