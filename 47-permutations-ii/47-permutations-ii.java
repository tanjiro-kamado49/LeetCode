class Solution {
    public static void permutation(int nums[],int mark[],Set<List<Integer>>ans, List<Integer>ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(mark[i]==0){
                mark[i]=1;
                ds.add(nums[i]);
                permutation(nums,mark,ans,ds);
                ds.remove(ds.size()-1);
                mark[i]=0;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int mark[]=new int[nums.length];
        Set<List<Integer>>ans=new HashSet<>();
        List<Integer>ds=new ArrayList<>();
        permutation(nums,mark,ans,ds);
        List<List<Integer>>res=new ArrayList<>(ans);
        // for(int i=0;i<ans.size();i++){
        //     res.add(ans.get(i));
        // }
        return res;
        
    }
}