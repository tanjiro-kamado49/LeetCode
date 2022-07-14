class Solution {
    public int minimumDeletions(int[] nums) {
        int n =nums.length;
        if(n==1) return 1;
        if(n==2) return 2;
        int min=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max]) max=i;
            if(nums[i]<nums[min]) min=i;
        }
        
        if(min>max){
            int t=max;
            max=min;
            min=t;
        }
      int ans=0;
        int mid=n/2;
        if(min<mid && max<mid){
            ans=max+1;
        }
        else if(min>mid && max>mid){
            ans=n-min;
        }
        else if(min==mid && max>mid){
            ans=n-min;
        }
        else if(max==mid &&min<mid){
            ans=mid+1;
        }
        else if(max==mid && min==mid){
            ans=mid+1;
        }
        else{
            ans=Math.min(n-max+min+1,Math.min(max+1,n-min));
        }
        return ans;
        
    }
}