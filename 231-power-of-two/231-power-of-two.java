class Solution {
    public boolean isPowerOfTwo(int n) {
            if(n<=0) return false;
            int d=(n&(n-1));
            if(d==0) return true;
            return false;
        
    }
}