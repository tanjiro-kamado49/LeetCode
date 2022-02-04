class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
            int lengthTrip[]=new int[1001];
            for(int i=0;i<trips.length;i++){
                    lengthTrip[trips[i][1]]+=trips[i][0];
                    lengthTrip[trips[i][2]]-=trips[i][0];
            }
            int total=0;
            for(int i=0;i<1001;i++){
                    total+=lengthTrip[i];
                    if(total>capacity) return false;
            }
            return true;
        
    }
}