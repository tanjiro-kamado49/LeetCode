class Solution {
    
    public int findCircleNum(int[][] isConnected) {
             int n=isConnected.length;
            
            int visit[]=new int[n];
            int count=0;
           
            for(int i=0;i<n;i++){
                    if(visit[i]!=1){
                            dfs(isConnected,i,visit);
                            count++;
                    }
            }
            return count;
            
    }
        public void dfs(int isConnected[][],int s ,int []visit){
                visit[s]=1;
                for(int i=0;i<isConnected.length;i++){
                        if(visit[i]!=1 && isConnected[s][i]==1){
                                dfs(isConnected,i,visit);
                        }
                }
        }
}