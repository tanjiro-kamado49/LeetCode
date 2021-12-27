class Solution {
       class Point{
                int x,y;
                Point(int x,int y){
                        this.x=x;
                        this.y=y;
                }
        }
        static boolean isValid(int[][]image,int n,int m,int pos_x,int pos_y,int cur_color,int newColor){
                if(pos_x<0 ||pos_x>=n || pos_y<0 ||pos_y>=m || image[pos_x][pos_y]!=cur_color ||image[pos_x][pos_y]==newColor) 
                                        return false;
                return true;
        }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int n=image.length;
            int m=image[0].length;
            List<Point>q=new ArrayList<>();
            q.add(new Point(sr,sc));
            int cur_color=image[sr][sc];
            image[sr][sc]=newColor;
            while(q.isEmpty()==false){
                    Point currentPixel=q.remove(0);
                    int pos_x=currentPixel.x;
                    int pos_y=currentPixel.y;
                    if(isValid(image,n,m,pos_x+1,pos_y,cur_color,newColor)){
                            q.add(new Point(pos_x+1,pos_y));
                             image[pos_x+1][pos_y]=newColor;
                    }
                     if(isValid(image,n,m,pos_x-1,pos_y,cur_color,newColor)){
                            q.add(new Point(pos_x-1,pos_y));
                             image[pos_x-1][pos_y]=newColor;
                    }
                     if(isValid(image,n,m,pos_x,pos_y+1,cur_color,newColor)){
                            q.add(new Point(pos_x,pos_y+1));
                             image[pos_x][pos_y+1]=newColor;
                    }
                     if(isValid(image,n,m,pos_x,pos_y-1,cur_color,newColor)){
                            q.add(new Point(pos_x,pos_y-1));
                             image[pos_x][pos_y-1]=newColor;
                    }
            }
            return image;
        
    }
}