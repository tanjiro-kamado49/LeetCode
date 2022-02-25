class Solution {
    public int countOdds(int low, int high) {
            if(low==high){
                    if(low%2!=0){
                            return 1;
                    }
            }
            // int count=0;
            if(low==0){
                    if(high%2!=0){
                            return high/2+1;
                    }
                    else{
                            return high/2;
                    }
                    
            }
            int count=high-low;
            int ans=count/2;
            if(low%2!=0 ||high%2!=0) return ans+1;
            return  ans;
            
        
    }
}