class Solution {
    public char findTheDifference(String s, String t) {
             int val = 0;
        for(char c : s.toCharArray()){
            val ^= c;
        }
        for(char c : t.toCharArray()){
            val ^= c;
        }
        return (char) val;
            
        
    }
}