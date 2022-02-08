class Solution {
    public boolean isPowerOfThree(int n) {
            if(n==0) return false;
            if(n==1) return true;
            int cur=n;
            while(cur%3==0){
                    if(cur==3) return true;
                    cur=cur/3;
            }
            return false;
        
    }
}