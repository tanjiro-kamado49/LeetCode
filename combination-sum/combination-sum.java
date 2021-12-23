class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Set<List<Integer>>ans=new HashSet<List<Integer>>();
            find(ans,candidates,target,new ArrayList<>(),0);
            return new ArrayList<>(ans);
        
    }
        void find(Set<List<Integer>>ans,int[] candidates, int target,List<Integer> arr,int sum){
                if(sum>target) return;
                if(sum==target){
                        Collections.sort(arr);
                        ans.add(arr);
                        return;
                }
                for(int n:candidates){
                        List<Integer>arrlist=new ArrayList<>(arr);
                        arrlist.add(n);
                        find(ans,candidates,target,arrlist,sum+n);
                        
                }
        }
}