class Solution {
    public int numPairsDivisibleBy60(int[] time) {
            int n=time.length;
            int rem[]=new int[60];
            for(int i=0;i<n;i++){
                    rem[time[i]%60]++;
                    
            }
            int count=0;
            count+=(rem[0]*(rem[0]-1))/2;
            count+=(rem[30]*(rem[30]-1))/2;
            for(int i=1;i<=29;i++){
                    count+=rem[i]*rem[60-i];
            }
            return count;
        
    }
}