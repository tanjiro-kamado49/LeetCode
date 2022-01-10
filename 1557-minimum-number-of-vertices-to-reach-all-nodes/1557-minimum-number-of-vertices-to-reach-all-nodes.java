class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            List<Integer>ans=new ArrayList<>();
            int[]visit=new int[n];
            for(int i=0;i<edges.size();i++){
                    for(int j=0;j<1;j++){
                            int t=edges.get(i).get(j+1);
                            visit[t]++;
                    }
            }
            for(int i=0;i<n;i++){
                    if(visit[i]==0){
                            ans.add(i);
                    }
            }
            return ans;
            
        
    }
}