class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int x=columnTitle.charAt(n-1);
        int sum=x-65+1;
        for(int i=n-2;i>=0;i--){
            x=columnTitle.charAt(i);
            int p=(int)Math.pow(26,n-i-1);
            sum+=p*(x-65+1);
        }
        return sum;
        
    }
}