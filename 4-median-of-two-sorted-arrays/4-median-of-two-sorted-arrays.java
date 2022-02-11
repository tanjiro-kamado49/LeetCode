class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n=nums1.length;
            int m=nums2.length;
            int l1=0;
            int l2=0;
            int c[]=new int[n+m];
            int x=0;
            while(l1<n || l2<m){
                    if(l1==n && l2!=m){
                            c[x]=nums2[l2++];
                            
                    }
                    else if(l2==m && l1!=n){
                            c[x]=nums1[l1++];
                    }
                    else if(nums1[l1]<nums2[l2]){
                            c[x]=nums1[l1++];
                    }
                    else{
                             c[x]=nums2[l2++];
                    }
                    x++;
                    
            }
            double sum=0.0;
            if((n+m)%2==0){
                    sum=c[(n+m)/2]+c[(n+m)/2-1];
                    sum=sum/2.0;
            }
            else{
                    sum=c[(n+m)/2];
            }
            // System.out.println
            return sum;
            
        
    }
}