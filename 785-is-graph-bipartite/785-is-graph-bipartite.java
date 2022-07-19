class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        int n=graph.length;
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                Queue<Integer>q=new LinkedList<>();
                q.add(i);
                color[i]=1;
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int id:graph[node]){
                        if(color[id]==-1){
                            color[id]=1-color[node];
                            q.add(id);
                        }
                        else if(color[id]==color[node]) return false;
                    }
                    
                }
                
            }
        }
        return true;
        
    }
}