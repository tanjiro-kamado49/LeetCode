class Solution {
        List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            solve(nums,0,new ArrayList(),new HashSet());
            return ans;
        
    }
        public  void solve(int nums[],int idx,List<Integer>cur,Set<List<Integer>> set){
                if(idx>=nums.length){
                        if(!set.contains(cur))
                            ans.add(new ArrayList<>(cur));
                        set.add(cur);
                        return;
                }
                cur.add(nums[idx]);
                solve(nums,idx+1,cur,set);
                cur.remove(cur.size()-1);
                solve(nums,idx+1,cur,set);
                
        }
}