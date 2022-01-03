class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1, c=0;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b; 
    }
}