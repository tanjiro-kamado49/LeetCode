class Solution {
    public boolean detectCapitalUse(String word) {
        int l=0;
        int u=0;
        int n=word.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))==true){
                u++;
            }
               else{
                   l++;
               }
        }
        if(Character.isUpperCase(word.charAt(0))==true && l==n-1){
            return true;
        }
        if(u==n || l==n){
            return true;
        }
        return false;
        
    }
}