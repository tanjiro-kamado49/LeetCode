class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
            int r=grid.length;
            int c=grid[0].length;
            if(grid[0][0]==1  ){
                    return 0;
            }
            
            int dp[][]=new int[r][c];
            dp[0][0]=1;
            for(int i=1;i<r;i++){
                    if(grid[i][0]==1){
                                     dp[i][0]=-1;
                    }
                    else{  if(dp[i-1][0]!=-1)
                                    dp[i][0]=1;
                         else{
                                 dp[i][0]=-1;
                         }
                    }
            }
             for(int i=1;i<c;i++){
                    if(grid[0][i]==1){
                            dp[0][i]=-1;
                    }
                    else{   if(dp[0][i-1]!=-1)
                            dp[0][i]=1;
                         else
                                 dp[0][i]=-1;
                    }
            }
            for(int i=1;i<r;i++){
                    for(int j=1;j<c;j++){
                            if(grid[i][j]==1){
                                    dp[i][j]=-1;
                            }
                            else{
                                    int ans=0;
                                    if(dp[i-1][j]!=-1){
                                            ans+=dp[i-1][j];
                                    }
                                    if(dp[i][j-1]!=-1){
                                            ans+=dp[i][j-1];
                                    }
                                    dp[i][j]=ans;
                                    
                            }
                    }
            }
            //for(int i=0;i<r;i++){
                    //for(int j=0;j<c;j++){
                            //System.out.print("dp["+i+"]["+j+"]= "+dp[i][j]);
                    //}
                    //System.out.println("");
            //}
            if(dp[r-1][c-1]==-1) return 0;
            return dp[r-1][c-1];
            
        
    }
}