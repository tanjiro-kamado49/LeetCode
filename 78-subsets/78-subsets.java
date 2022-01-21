class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer>empty=new ArrayList<>();
            ans.add(empty);
            int n=nums.length;
            for(int i=0;i<n;i++){
                    int el=nums[i];
                    int len=ans.size();
                    for(int j=0;j<len;j++){
                            List<Integer>temp=new ArrayList<>(ans.get(j));
                            temp.add(el);
                            ans.add(temp);
                            
                    }
            }
            return ans;
        
    }
}