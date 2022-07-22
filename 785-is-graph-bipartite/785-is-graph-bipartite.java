class Solution {
    boolean dfs(int[][]graph,int node,int[]color){
        if(color[node]==-1) color[node]=1;
        for(int id:graph[node]){
            if(color[id]==-1){
                color[id]=1-color[node];
                if(!dfs(graph,id,color)) return false;
            }
            else if(color[id]==color[node]) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[]color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(graph,i,color)) return false;
            }
        }
        return true;
    }
}