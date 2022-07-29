class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<secret.length();i++){
             if(hm.containsKey(secret.charAt(i))) hm.put(secret.charAt(i),hm.get(secret.charAt(i))+1);
            else hm.put(secret.charAt(i),1);
        }
        int w=0;
        int c=0;
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)==secret.charAt(i)){
                hm.put(secret.charAt(i),hm.get(secret.charAt(i))-1);
                
                c++;
            }
        }
        for(int i=0;i<secret.length();i++){
            if(guess.charAt(i)!=secret.charAt(i)){
                if(hm.containsKey(guess.charAt(i))==true && hm.get(guess.charAt(i))!=0){
                    hm.put(guess.charAt(i),hm.get(guess.charAt(i))-1);
                           w++;
                }
            }
            
        }
            
        
        String s="";
        s+=Integer.toString(c);
        s+='A';
        s+=Integer.toString(w);
        s+='B';
        return s;
        
    }
}