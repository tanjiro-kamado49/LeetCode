class Solution {
        int max_gold;
    public int getMaximumGold(int[][] grid) {
            int r=grid.length;
            int c=grid[0].length;
            for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                            if(grid[i][j]!=0){
                                    int visited[][]=new int[r][c];
                                     findGold(grid,visited,grid[i][j],i,j);
                            }
                    }
            }
            return max_gold;
    }
        void findGold(int[][]grid,int [][]visited,int cur,int i,int j){
                
                max_gold=Math.max(max_gold,cur);
                int r=grid.length;
                int c=grid[0].length;
                visited[i][j]=1;
                if(i<r && j<c){
                        //up
                        if(i-1>=0  && visited[i-1][j]!=1 && grid[i-1][j]!=0){
                                findGold(grid,visited,cur+grid[i-1][j],i-1,j);
                        }
                        //down
                         if(i+1<r  && visited[i+1][j]!=1 && grid[i+1][j]!=0){
                                findGold(grid,visited,cur+grid[i+1][j],i+1,j);
                        }
                        //left
                         if(j-1>=0  && visited[i][j-1]!=1 && grid[i][j-1]!=0){
                                findGold(grid,visited,cur+grid[i][j-1],i,j-1);
                        }
                        //right
                         if(j+1<c  && visited[i][j+1]!=1 && grid[i][j+1]!=0){
                                findGold(grid,visited,cur+grid[i][j+1],i,j+1);
                        }
                }
                visited[i][j]=0;
                
        }
}