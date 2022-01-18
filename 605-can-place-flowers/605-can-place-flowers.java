class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int ans=0;
        for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i]==0){
                        int p= (i==0 || flowerbed[i-1]==0) ?0:1;
                        int next=(i==flowerbed.length-1 || flowerbed[i+1]==0) ? 0:1;
                        if(p==0 && next==0){
                                ans++;
                                flowerbed[i]=1;
                        }   
               }
        }
                if(ans>=n) return true;
                return false;
    }
}