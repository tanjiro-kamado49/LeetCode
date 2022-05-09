class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
            int col=matrix[0].length;
            int dr[]=new int[row];
            int dc[]=new int[col];
            for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                            if(matrix[i][j]==0){
                                    dr[i]=1;
                                    dc[j]=1;
                            }
                    }
            }
            for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                            if(dr[i]==1 ||dc[j]==1){
                                    matrix[i][j]=0;
                            }
                    }
            }
    }
}