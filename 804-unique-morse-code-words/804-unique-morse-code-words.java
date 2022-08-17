class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String st[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};    
        Set<String>hs=new HashSet<>();
        for(int i=0;i<words.length;i++){
               String ans="";
            for(int j=0;j<words[i].length();j++){
                ans+=st[words[i].charAt(j)-'a']; 
            }
              hs.add(ans);
            
        }
        return hs.size();
        
    }
}