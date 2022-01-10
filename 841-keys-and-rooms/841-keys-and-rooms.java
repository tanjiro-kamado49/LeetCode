class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
           int []visit=new int[rooms.size()];
            visit[0]=1;
            Queue<Integer>q=new  LinkedList<>();
            q.add(0);
            visit[0]=1;
            while(q.isEmpty()==false){
                    int room=q.remove();
                     visit[room]=1;
                    for(int i=0;i<rooms.get(room).size();i++){
                            int k=rooms.get(room).get(i);
                            
                            if(room!=k && k!=0 && visit[k]!=1 ){
                                   q.add(k);
                                    
                            }
                    }
            }
            for(int i=0;i<visit.length;i++){
                    if(visit[i]==0) return false;
            }
            return true;
    }
}