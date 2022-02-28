class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>ans=new ArrayList<>();
            int n=nums.length;
            for(int i=0;i<n;i++){
                    int k=nums[i];
                    while(i+1<nums.length && nums[i]==nums[i+1]-1){
                            i++;
                    }
                    if(k!=nums[i]){
                            ans.add(""+k+"->"+nums[i]);
                    }
                    else{
                            ans.add(""+nums[i]);
                    }
            }
            return ans;
    }
}