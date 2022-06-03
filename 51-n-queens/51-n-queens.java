class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char board[][]=new char[n][n];
          for(int i=0;i<n;i++){
              Arrays.fill(board[i],'.');
          }
        int[]lr=new int[n];
        int []ld=new int[2*n-1];
        int[] ud=new int[2*n-1];
        func(0,board, lr,ld,ud,n,ans);
        return ans;
        
        
    }
    public static void func(int col, char[][]board, int[]lr, int[]ld, int[]ud, int n, List<List<String>>ans){
        if(col==n){
            List<String>res=construct(board);
            ans.add(res);
            return;
        }
        for(int row=0;row<n;row++){
            if(lr[row]==0 && ld[row+col]==0 && ud[(n-1)+(col-row)]==0){
                board[row][col]='Q';
                lr[row]=1;
                ld[row+col]=1;
                ud[(n-1)+(col-row)]=1;
                func(col+1,board,lr,ld,ud,n,ans);
                board[row][col]='.';
                lr[row]=0;
                ld[row+col]=0;
                ud[(n-1)+(col-row)]=0;
                
            }
        }
    }
    public static List<String> construct(char board[][]){
        List<String>res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
}