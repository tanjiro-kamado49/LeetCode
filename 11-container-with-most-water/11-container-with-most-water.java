class Solution {
    public int maxArea(int[] height) {
            int l=0;
            int r=height.length-1;
            int cur=0;
            int res=0;
            while(l<r){
                    cur=Math.min(height[l],height[r])*(r-l);
                    res=Math.max(res,cur);
                    if(height[l]<height[r]){
                            l++;
                    }
                    else{
                            r--;
                    }
            }
            return res;
            
        
    }
}