class Solution {
    public void rotate(int[][] matrix) {
            int r=matrix.length;
            int c=matrix[0].length;
            for(int i=0;i<r;i++){
                    for(int j=i;j<c;j++){
                            int temp=matrix[i][j];
                            matrix[i][j]=matrix[j][i];
                            matrix[j][i]=temp;
                            
                    }
            }
            for(int i=0;i<matrix.length;i++){
                   int s=0;
                    int e=c-1;
                    while(s<e){
                            int temp=matrix[i][s];
                            matrix[i][s]=matrix[i][e];
                            matrix[i][e]=temp;
                            s++;
                            e--;
                    }
            }
            
        
    }
}