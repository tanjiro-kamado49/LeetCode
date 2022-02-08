class Solution {
    public void gameOfLife(int[][] board) {
            int r=board.length;
            int c=board[0].length;
            int ans[][]=new int[r][c];
            int dir[]={1,0,-1,0,1,1,-1,-1,1};
            for(int i=0;i<r;i++){
                    int src=0;      
                    for(int j=0;j<c;j++){
                            src=board[i][j];
                            // System.out.println("src"+src);
                            int count=0;
                            for(int k=0;k<dir.length-1;k++){
                                    int row=i+dir[k];
                                    int col=j+dir[k+1];
                                    // System.out.printf("col- "+col+"row- "+row);
                                     if(row>=0 && col>=0 && row<r &&col<c){
                                             
                                             if(board[row][col]==1){
                                                     count++;
                                             }
                                     }
                                   
                            }
                            // System.out.println("count- "+count);
                            if(src==1){
                                    if(count<2){
                                            ans[i][j]=0;
                                    }
                                    if(count==2 || count==3){
                                            ans[i][j]=1;
                                            
                                    }
                                    if(count>3){
                                            ans[i][j]=0;
                                    }
                            }
                            if(src==0){
                                    if(count==3){
                                            ans[i][j]=1;
                                    }
                            }
                           
                    }
            }
            for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                            board[i][j]=ans[i][j];
                    }
            }
        
    }
}