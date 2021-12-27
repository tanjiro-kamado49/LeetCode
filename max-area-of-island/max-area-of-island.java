class Solution {
        int dfs(int[][]grid,int row,int col){
                int n=grid.length;
                int m=grid[0].length;
                grid[row][col]=0;
                int area=1;
                int dir[]={-1,0,1,0,-1};
                for(int i=0;i<4;i++){
                        int r=row+dir[i];
                        int c=col+dir[i+1];
                        if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
                                area+=dfs(grid,r,c);
                        }        
                }
                return area;
        }
    public int maxAreaOfIsland(int[][] grid) {
            int maxArea=0;
            for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[i].length;j++){
                            if(grid[i][j]==1){
                                    maxArea=Math.max(maxArea,dfs(grid,i,j));
                                    
                            }
                    }     
            }
            return maxArea;   
    }
}