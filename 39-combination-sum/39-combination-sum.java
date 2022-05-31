class Solution {
    public static void func(int ind,int target,int arr[],List<List<Integer>>ans,List<Integer>ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            func(ind,target-arr[ind],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
        func(ind+1,target,arr,ans,ds);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        func(0,target,candidates,ans,new ArrayList<>());
        return ans;
        
    }
}