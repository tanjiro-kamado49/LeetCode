class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int n=arr.length;
        if(n<3) return false;
        int l=0;
        int r=n-1;
        while(l+1<n-1 && arr[l+1]>arr[l]) l++;
        while(r-1>0 && arr[r-1]>arr[r]) r--;
        
        
        return l==r;
        
        
    }
}