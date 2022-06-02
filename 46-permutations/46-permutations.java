class Solution {
    public static void func(int id,int[]arr,List<List<Integer>>ans){
        if(id==arr.length){
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++) ds.add(arr[i]);
            ans.add(new ArrayList<>(ds));
        }
        for(int i=id;i<arr.length;i++){
            swap(arr,id,i);
            func(id+1,arr,ans);
            swap(arr,id,i);
        }
    }
    public static void swap(int arr[],int id,int i){
        int temp=arr[id];
        arr[id]=arr[i];
        arr[i]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        func(0,nums,ans);
        return ans;
        
    }
}