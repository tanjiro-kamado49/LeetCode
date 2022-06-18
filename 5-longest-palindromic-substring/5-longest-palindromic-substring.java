class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        int maxlength=1;
        int start=0;
        for(int i=0;i<n;i++) dp[i][i]=true;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                if(maxlength<2){
                    maxlength=2;
                    start=i;
                }
            }
        }
        for(int i=3;i<=n;i++){
            for(int r=0;r<n-i+1;r++){
                int c=r+i-1;
                if(dp[r+1][c-1]==true && s.charAt(r)==s.charAt(c)){
                    dp[r][c]=true;
                    if(maxlength<i){
                        maxlength=i;
                        start=r;
                    }
                }
            }
        }
        String ans=s.substring(start,start+maxlength);
        return ans;
        
    }
}