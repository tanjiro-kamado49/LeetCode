class Solution {
        List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
           int visit[]=new int[graph.length];
                    List<Integer>list=new ArrayList<>();
                      dfs(graph,visit,list,0);

            return ans;
        
    }
        public void dfs(int graph[][],int visit[],List<Integer>list,int i){
                
                if(i==graph.length-1){
                        list.add(i);
                         ArrayList<Integer> answer=new ArrayList<>(list);
                        ans.add(answer);
                        list.remove(list.size()-1);
                }
                visit[i]=1;
                 list.add(i);
               // System.out.printl
              
                for(int j=0;j<graph[i].length;j++){
                        if(visit[graph[i][j]]==0){
                                dfs(graph,visit,list,graph[i][j]);
                        }
                        
                        
                }
                list.remove(list.size()-1);
                visit[i]=0;
                
        }
}