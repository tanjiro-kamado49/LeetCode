class Solution {
    public int findJudge(int n, int[][] trust) {
            int edge[]=new int[n+1];
            for(int i=0;i<trust.length;i++){
                    edge[trust[i][0]]--;
                    edge[trust[i][1]]++;
            }
            for(int i=1;i<edge.length;i++){
                    if(edge[i]==n-1) return i;
                    
            }
            return -1;
            
        
    }
}