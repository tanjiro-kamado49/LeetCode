class Solution {
    public static void solve(String s,Set<String>dict,String store,List<String>ans){
        if(s.length()==0){
            String temp="";
            for(int i=0;i<store.length()-1;i++) temp+=store.charAt(i);
            ans.add(temp);
            return ;
        }
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i+1);
            if(dict.contains(left)==true){
                String right=s.substring(i+1);
                solve(right,dict,store+left+" ",ans);
            }
        }
        
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String>ans=new ArrayList<>();
        solve(s,new HashSet<String>(wordDict),"",ans);
        Collections.sort(ans);
        return ans;
        
    }
}