class Solution {
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>>ans=new ArrayList<>();
            List<Integer>temp=new ArrayList<>();
            int visit[]=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                    visit[i]=22;
            }
            find(nums,ans,temp,visit);
           return ans;
    }
        public void find(int []nums,List<List<Integer>> ans, List<Integer> temp, int []visit){
                if(nums.length==temp.size()) {
                        ans.add(new ArrayList<>(temp));
                        return;
                }
                for(int i=0;i<nums.length;i++){
                        if(visit[i]==22){
                                temp.add(nums[i]);
                                visit[i]=nums[i];
                                find(nums,ans,temp,visit);
                                temp.remove(temp.size()-1);
                                visit[i]=22;
                        }
                }
        }
}