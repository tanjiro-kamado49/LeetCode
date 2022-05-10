class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int last=n+m-1;
            int ml=m-1;
            int nl=n-1;
            while(nl>=0 && ml>=0){
                    if(nums1[ml]>nums2[nl]){
                            nums1[last--]=nums1[ml];
                            ml--;
                    }
                    else{
                            nums1[last--]=nums2[nl];
                            nl--;
                    }
            }
            while(nl>=0){
                    nums1[last--]=nums2[nl--];
                    
            }
        
    }
}