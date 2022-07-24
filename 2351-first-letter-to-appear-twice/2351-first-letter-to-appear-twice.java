class Solution {
    public char repeatedCharacter(String s) {
        int freq[]=new int[26];
        for(char x:s.toCharArray()){
            if(++freq[x-'a']==2) return x;
            
        }
        return 'a';
    }
}