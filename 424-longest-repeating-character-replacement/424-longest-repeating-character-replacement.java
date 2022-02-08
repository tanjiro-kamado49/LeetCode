class Solution {
    public int characterReplacement(String s, int k) {
            HashMap<Character,Integer>hm=new HashMap<>();
            int r=0;
            int l=0;
            int res=0;
            int maxfreq=0;
            for(r=0;r<s.length();r++){
                    hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
                    maxfreq=Math.max(maxfreq,hm.get(s.charAt(r)));
                    while((r-l+1)-maxfreq>k){
                             hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                            l++;
                            
                    }
                    res=Math.max(res,r-l+1);
            }
            return res;
        
    }
}