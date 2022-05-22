class Solution {

    public int minimumLines(int[][] stock) {
        if(stock.length==1) return 0;
        Arrays.sort(stock, (a, b) -> a[0] - b[0]);
        int count=1;
        for(int i=2;i<stock.length;i++){
          int x1 = stock[i][0],x2 = stock[i-1][0],x3 = stock[i-2][0];
            int y1 = stock[i][1],y2 = stock[i-1][1],y3 = stock[i-2][1];
            int diff1 = (y3-y2) * (x2-x1);
            int diff2 = (y2-y1) * (x3-x2);
            if(diff1!=diff2){
                count++;
            }
                
        }
        return count;
        
    }
    
    
}