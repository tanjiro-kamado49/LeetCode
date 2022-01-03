class Solution {
    public List<String> letterCasePermutation(String s) {
            List<String>ans=new ArrayList<>();
            find(s.toCharArray(),ans,0,s.length());
            return ans;
        
    }
        public void find(char []s,List<String>ans,int l,int r){
                if(l>=r){
                        ans.add(new String(s));
                        return ;
                }
                if(!Character.isAlphabetic(s[l])){
                        find(s,ans,l+1,r);
                        return;
                }
                s[l]=Character.toLowerCase(s[l]);
                find(s,ans,l+1,r);
                
                s[l]=Character.toUpperCase(s[l]);
                find(s,ans,l+1,r);
        }
}