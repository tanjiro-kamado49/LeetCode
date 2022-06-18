class Solution {
    public String reverseWords(String s) {
   List<String> str=new ArrayList<>();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(temp.length()!=0){
                    str.add(temp.toString());
                     temp.setLength(0); 
                    
                }
                continue;
            }
            else{
                temp.append(s.charAt(i));
            }
        }
        if(temp.length()!=0){
            str.add(temp.toString());
            temp.setLength(0); 
                    
        }
        String ans="";
        for(int i=str.size()-1;i>=0;i--){
            if(i!=0) ans+=str.get(i)+" ";
            else{
                ans+=str.get(i);
            }
            
        }
        return ans;
        
    }
}