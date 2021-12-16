class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals,(a,b)->a[1]-b[1]);
            int prev_s=intervals[0][0];
            int prev_e=intervals[0][1];
            int ans=0;
            for(int i=1;i<intervals.length;i++){
                    int new_s=intervals[i][0];
                    int new_e=intervals[i][1];
                    if(new_s<=prev_s || new_s<prev_e) ans++;
                    else{
                            prev_s=new_s;
                            prev_e=new_e;
                    }
            }
            return ans;
        
    }
}