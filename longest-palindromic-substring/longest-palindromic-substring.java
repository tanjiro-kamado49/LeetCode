class Solution {
    public String longestPalindrome(String s) {
            int n=s.length();
            int maxLength=1;
            int start=0;
            boolean dp[][]=new boolean[n][n];
            for(int i=0;i<n;i++ ){
                    for(int j=0;j<n;j++){
                            dp[i][j]=false;
                    }
            }
            //System.out.println("lenght==1-----------------");
            for(int i=0;i<n;i++) dp[i][i]=true;
            for(int i=0;i<n-1;i++){
                    //System.out.println("lenght==2-----------------");
                    //System.out.println("Strg----"+s.charAt(i)+" "+s.charAt(i+1));
                    if(s.charAt(i)==s.charAt(i+1)) {
                            
                            //System.out.println("String pal----"+i+(i+1));
                            dp[i][i+1]=true;
                            start = i;
			    maxLength = 2;
                         }
            }
            for(int k=3;k<=n;k++){
                    for(int i=0;i<n-k+1;i++){
                            int j=i+k-1;
                            //System.out.println("lenght>3-----------------");
                            //System.out.println("dp-----"+dp[i+1][j-1]);
                             //System.out.println("string start-- "+s.charAt(i)+"   last one -- "+s.charAt(j));
                            if(dp[i+1][j-1]==true && s.charAt(i)==s.charAt(j)){
                                    dp[i][j]=true;
                                    if (k > maxLength) {
					start = i;
					maxLength = k;
				}
                            }
                    }
                    
            }
            String ans=s.substring(start,start+maxLength);
            return ans;
        
    }
}