class Solution {
        List<List<Integer>> ans= new ArrayList<>();
            LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
            int visit[]=new int[n];

            find(n,k,1);
            return ans;
            
        
    }
        public void find(int n,int k,int s){
                if(temp.size()==k){
                        ans.add(new ArrayList<>(temp));
                        return ;
                }
                for(int i=s;i<=n-(k-temp.size())+1;i++){
                        temp.add(i);
                        find(n,k,i+1);
                        temp.removeLast();
                }
        }
}