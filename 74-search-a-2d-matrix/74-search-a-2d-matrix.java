class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
               int i=0;
        int j=matrix[0].length-1;
        int r=matrix.length;
        int c=matrix[0].length;
        while(i>=0 && j>=0 && i<r && j<c){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
    
        
    }
}