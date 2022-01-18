class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
            boolean []isroot=new boolean[n];
            int root=0;
            Arrays.fill(isroot,true);
            int rootCount=0;
            for(int i=0;i<n;i++){
                    if(leftChild[i]!=-1) isroot[leftChild[i]]=false;
                    if(rightChild[i]!=-1) isroot[rightChild[i]]=false;
            }
            for(int i=0;i<n;i++){
                    if(isroot[i]==true) {
                            rootCount++;
                            root=i;
                    }
            }
            if(rootCount!=1) return false;
            boolean visited[]=new boolean[n];
            Arrays.fill(visited,false);
            Queue<Integer>q=new ArrayDeque<>();
            int count=0;
            q.add(root);
            while(q.isEmpty()==false){
                    int cur=q.poll();
                    count++;
                    if(visited[cur]==true) return false;
                    visited[cur]=true;
                    if(leftChild[cur]!=-1) q.add(leftChild[cur]);
                    if(rightChild[cur]!=-1) q.add(rightChild[cur]);
            }
            return count==n;
        
    }
}