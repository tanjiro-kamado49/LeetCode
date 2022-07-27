class Solution {
    public static void swap(int x,int y,int nums[]){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    
    public static void  solve(int id,int[]nums,Set<List<Integer>>ans){
        if(id==nums.length){
            ArrayList<Integer>ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);                
            }
            ans.add(ds);
            return ;
        }
        for(int i=id;i<nums.length;i++){
            swap(i,id,nums);
            solve(id+1,nums,ans);
            swap(i,id,nums);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>>ans=new HashSet<>();
        solve(0,nums,ans);
        List<List<Integer>>res=new ArrayList<>(ans);
        return res;
    }
}