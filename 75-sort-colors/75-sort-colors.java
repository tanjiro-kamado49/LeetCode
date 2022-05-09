class Solution {
    public void sortColors(int[] nums) {
            int n0=0;
            int n1=0;
            int n2=0;
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==0) n0++;
                    if(nums[i]==1) n1++;
                    if(nums[i]==2) n2++;
            }
            // System.out.println(n0,)
            int k=0;
            for(k=0;k<n0;k++){
                    nums[k]=0;
            }
            int j=k+n1;
            for(;k<j;k++){
                    nums[k]=1;
                    
            }
            j=k+n2;
            for(;k<j;k++){
                    nums[k]=2;
            }
            
    }
}