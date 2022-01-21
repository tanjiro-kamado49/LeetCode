class Solution {
          List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
          
            List<Integer>em=new ArrayList<>();
            solve(nums,0,em);
            return ans;
        
    }
        public  void solve(int nums[],int idx,List<Integer>cur){
                if(idx>=nums.length){
                        ans.add(new ArrayList<>(cur));
                        return;
                }
                cur.add(nums[idx]);
                solve(nums,idx+1,cur);
                cur.remove(cur.size()-1);
                solve(nums,idx+1,cur);
                
        }
}