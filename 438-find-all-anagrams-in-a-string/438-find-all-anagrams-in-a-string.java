class Solution {
    public List<Integer> findAnagrams(String s, String p) {
            List<Integer>ans=new ArrayList<>();
            if(p.length()>s.length()) return ans;
            int count[]=freq(p);
            int n=s.length();
            int m=p.length();
            int Scount[]=freq(s.substring(0,m));
            if(same(count,Scount)==true){
                    ans.add(0);
            }
            for(int i=m;i<n;i++){
                    Scount[s.charAt(i-m)-'a']--;
                    Scount[s.charAt(i)-'a']++;
                    if(same(count,Scount)==true) ans.add(i-m+1);
            }
            return ans;
            
        
    }
        int[] freq(String s){
                int count[]=new int[26];
                for(int i=0;i<s.length();i++){
                        count[s.charAt(i)-'a']++;
                        
                }
                return count;
        }
        boolean same(int []count,int[]Scount){
                for(int i=0;i<26;i++){
                        if(count[i]!=Scount[i]) return false;
                        
                }
                return true;
        }
}