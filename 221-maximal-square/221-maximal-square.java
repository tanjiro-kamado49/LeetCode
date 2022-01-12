class Solution {
    public int maximalSquare(char[][] matrix) {
            int r=matrix.length;
            int c=matrix[0].length;
            int [][]ans=new int[r][c];
            int max=0;
           
            for(int i=r-1;i>=0;i--){
                    for(int j=c-1;j>=0;j--){
                            if(i==r-1 && j==c-1 ){
                                    ans[i][j]=matrix[i][j]-48;
                            }
                            else if(i==r-1){
                                     ans[i][j]=matrix[i][j]-48;
                                    
                            }
                            else if(j==c-1){
                                     ans[i][j]=matrix[i][j]-48;
                                    
                            }
                           else{
                                   if(matrix[i][j]=='0') {
                                           ans[i][j]=0;
                                   }
                                   else{
                                   
                                       int x=ans[i][j+1];
                                        int y=ans[i+1][j];
                                       int z=ans[i+1][j+1];
                                      int min=Math.min(x,y);
                                         min=Math.min(min,z);
                                      ans[i][j]=min+1;
                                   }
                                   
                           }
                             max=Math.max(max,ans[i][j]);
                            
                            
                    }
            }
           
            return max*max;
        
    }
}