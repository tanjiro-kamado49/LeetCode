class Solution {
    public int maxProfit(int[] prices) {
        int cur=prices[prices.length-1];
        int res=0;
        for(int i=prices.length-2;i>=0;i--){
            if(cur-prices[i]>0){
                res=Math.max(res,cur-prices[i]);
            }
            cur=Math.max(cur,prices[i]);
        }
        return res;
 
    }
}