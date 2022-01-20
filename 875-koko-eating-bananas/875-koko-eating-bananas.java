class Solution {
    public int minEatingSpeed(int[] piles, int h) {
            int max=0;
            int left=1;
            for(int pile:piles){
                    max=Math.max(pile,max);
            }
            while(left<=max){
                    int mid=(left+max)/2;
                    if(find(piles,mid,h)==true) max=mid-1;
                    else left=mid+1;
            }
            return left;
        
    }
        public boolean find(int []piles,int k,int h){
                int hour=0;
                for(int pile:piles){
                        int d=pile / k;
                        hour+=d;
                        if(pile%k!=0) hour++;
                }
                return hour<=h;
        }
}