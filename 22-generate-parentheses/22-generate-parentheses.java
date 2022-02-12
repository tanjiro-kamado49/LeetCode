class Solution {
    public List<String> generateParenthesis(int n) {
            List<String>ans=new ArrayList<>();
            recurr(1,0,"(",ans,n);
            return ans;
        
    }
       public  void recurr(int open, int close,String st,List<String>ans,int n){
                if(open==n && close==n){
                        ans.add(st);
                        return;
                }
                if(open<n){
                        recurr(open+1,close,st+"(",ans,n);
                }
                if(close<n && open>close){
                        recurr(open,close+1,st+")",ans,n);
                }
        }
}