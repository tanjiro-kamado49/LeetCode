class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char s[]=stamp.toCharArray();
        char t[]=target.toCharArray();
        
        boolean visited[]=new boolean[target.length()];
        List<Integer>res=new ArrayList<>();
        int st=0;
        while(st<target.length()){
            boolean replaced=false;
            for(int i=0;i<=t.length-s.length;i++){
                if(visited[i]==false && canreplace(s,i,t)){
                    st=replace(t,i,s.length,st);
                    replaced=true;
                    visited[i]=true;
                    res.add(i);
                    if(st==t.length) break;
                }
            }
            if(replaced==false) return new int[0];
        }
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(res.size()-i-1);
        }
        return ans;
    }
    boolean canreplace(char[]s, int p,char []t){
        for(int i=0;i<s.length;i++){
            if(t[i+p]!='*' && t[i+p]!=s[i]) return false;
        }
        return true;
    }
    int replace(char[] t, int p, int len, int count){
        for(int i=0;i<len;i++){
            if(t[i+p]!='*'){
                t[i+p]='*';
                count++;
            }
        }
        return count;
    }
}