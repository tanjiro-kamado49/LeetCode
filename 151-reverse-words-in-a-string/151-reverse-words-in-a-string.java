class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=s.length()-1;
        String temp="";
        String ans="";
        while(left<=right){
            char ch=s.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch==' ' && !temp.equals("")){
                if(!ans.equals("")){
                    ans=temp+" "+ans;
                }
                else{
                    ans=temp;
                }
                temp="";
            }
            left++;
        }
         if(!temp.equals("")){
                if(!ans.equals("")){
                    ans=temp+" "+ans;
                }
                else{
                    ans=temp;
                }
         }
        return ans;
        
        
    }
}