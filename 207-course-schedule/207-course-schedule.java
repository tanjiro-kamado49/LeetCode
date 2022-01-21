class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
            LinkedList<Integer>graph[]=new LinkedList[numCourses];
            for(int i=0;i<numCourses;i++){
                    graph[i]=new LinkedList<>();
            }
            for(int i=0;i<prerequisites.length;i++){
                    int u=prerequisites[i][0];
                    int v=prerequisites[i][1];
                    graph[v].add(u);
            }
            int visited[]=new int[numCourses];
           int res=0;
            res=topology(graph,numCourses);
            System.out.println();
            return res==numCourses;
        
    }
        	public int topology(LinkedList<Integer>graph[],int size) {
		int indegree[]=new int[size];
		Queue<Integer>q=new ArrayDeque<>();
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[i].size();j++) {
				indegree[graph[i].get(j)]++;
			}
		}
		for(int i=0;i<size;i++) {
			//System.out.println("indegree["+i+"]"+indegree[i]);
			if(indegree[i]==0) {
				q.add(i);
			}
		}
		int res=0;
		while(q.isEmpty()==false) {
			//System.out.println(q);
			int cur=q.poll();
			res++;
			Iterator<Integer> it=graph[cur].listIterator();
			while(it.hasNext()) {
				
				int n = it.next();
				indegree[n]--;
				if(indegree[n]==0) {
					q.add(n);
				}
			}
			
		}
		return res;
		
	}
}