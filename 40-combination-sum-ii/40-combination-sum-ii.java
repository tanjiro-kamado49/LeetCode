class Solution {
    public static void func(int id,int target,int[]arr,List<Integer>ds,List<List<Integer>>hs){
        if(target==0){
            hs.add(new ArrayList<>(ds));
            return;
        }
      for(int i=id;i<arr.length;i++){
          if(i>id && arr[i]==arr[i-1]) continue;
          if(arr[i]<=target){
                ds.add(arr[i]);
                func(i+1,target-arr[i],arr,ds,hs);   
                ds.remove(ds.size()-1);
          }
          else
              break;
        
      }
        
        
          
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>hs=new ArrayList<>();
        Arrays.sort(candidates);
        func(0,target,candidates,new ArrayList<>(),hs);  
        return hs;
        
    }
}