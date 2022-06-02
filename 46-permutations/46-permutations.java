class Solution {
      static void func(int[]nums, boolean freq[], List<List<Integer>>ans, List<Integer>ds){
            if(ds.size()==nums.length){
                ans.add(new ArrayList<>(ds));
            }
          for(int i=0;i<nums.length;i++){
              if(freq[i]==false){
                  freq[i]=true;
                  ds.add(nums[i]);
                  func(nums,freq,ans,ds);
                  freq[i]=false;
                  ds.remove(ds.size()-1);
              }
          }
            
        }
        
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        func(nums,freq,ans,ds);
        return ans;
        
    }
}