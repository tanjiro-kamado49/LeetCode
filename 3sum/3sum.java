class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>ans=new HashSet<>();
        int n=nums.length;
        if(n<3){
            return new ArrayList(ans);
        }
        else{
            Arrays.sort(nums);
            for(int i=0;i<n;i++){
                int l=i+1;
                int r=n-1;
                while(l<r){
                    int sum=nums[i]+nums[l]+nums[r];
                    if(sum==0){
                        ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    }
                    if(sum<0){
                        l++;
                    }
                    else{
                        r--;
                    }
                    
                }
            }
        }
        return new ArrayList(ans);
        
    }
}