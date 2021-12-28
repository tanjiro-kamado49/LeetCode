class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character>sub=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char temp=s.charAt(j);
            if(!sub.contains(temp)){
                sub.add(temp);
                max=Math.max(sub.size(),max);
                j++;
                
            }
            else{
                sub.remove(s.charAt(i++));
            }
        }
        return max;
        
    }
}