class Solution {
          class Point{
                    int r,c;
                    Point(int r, int c){
                            this.r=r;
                            this.c=c;
                    }
            }
    public int orangesRotting(int[][] grid) {
          List<Point>q=new ArrayList<>();
            int fresh=0;
            int n=grid.length;
            int m=grid[0].length;
            for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                            if(grid[i][j]==1) fresh++;
                            if(grid[i][j]==2)
                                        q.add(new Point(i,j));
                    }
                    
            }
            int []dir={-1,0,1,0,-1};
            int count=0;
            while(q.isEmpty()==false && fresh>0){
                    count++;
                    int size=q.size();
                    while(size-->0){
                            Point temp=q.remove(0);
                            for(int i=0;i<4;i++){
                                    int r=temp.r+dir[i];
                                    int c=temp.c+dir[i+1];
                                    if(r<0 ||r>=n ||c<0 ||c>=m || grid[r][c]==0 || grid[r][c]==2) continue;
                                    q.add(new Point(r,c));
                                    grid[r][c]=2;
                                    fresh--;
                            }     
                    }
                            
           }
            if(fresh==0) return count;
            return -1;
            
        
    }
}