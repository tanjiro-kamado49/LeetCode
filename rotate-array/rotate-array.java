class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        if(k>n)
            k=k%(n+1);
        reverse(nums,0,n-k);
        reverse(nums,n+1-k,n);
        reverse(nums,0,n);
        
    }
    void reverse(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}