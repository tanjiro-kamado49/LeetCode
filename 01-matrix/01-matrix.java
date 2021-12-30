class Solution {
        class Point{
                int x;
                int y;
                Point(int x,int y){
                        this.x=x;
                        this.y=y;
                }
        }
    public int[][] updateMatrix(int[][] mat) {
            LinkedList<Point>q=new LinkedList<>();
            for(int i=0;i<mat.length;i++){
                    for(int j=0;j<mat[0].length;j++){
                            if(mat[i][j]==0){
                                    q.add(new Point(i,j));
                            }
                            else{
                                    mat[i][j]=-1;
                            }
                    }
            }
            int dir[]={-1,0,1,0,-1};
            while(q.isEmpty()==false){
                    Point cur=q.remove(0);
                    for(int i=0;i<4;i++){
                            int r=cur.x+dir[i];
                            int c=cur.y+dir[i+1];
                            if(r>=0 && r<mat.length && c>=0 && c<mat[0].length && mat[r][c]==-1){
                                    mat[r][c]=mat[cur.x][cur.y]+1;
                                    q.add(new Point(r,c));
                            }
                    }
            }
            return mat;
            
        
    }
}