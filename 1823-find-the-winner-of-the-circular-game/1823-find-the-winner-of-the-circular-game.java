class Solution {
    public int findTheWinner(int n, int k) {
            
            Queue<Integer>q=new LinkedList<>();
            for(int i=0;i<n;i++){
                    q.add(i+1);
            }
            while(q.size()>1){
                    int del=k-1;
                    while(del>0){
                            q.add(q.remove());
                            del--;
                    }
                    q.remove();
            }
            return q.remove();
        
    }
}