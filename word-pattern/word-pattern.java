class Solution {
    public boolean wordPattern(String pattern, String s) {
            HashMap<Character,String>h1=new HashMap<>();
            HashMap<String,Character>h2=new HashMap<>();
            String []str=s.split(" ");
            if(str.length!=pattern.length()){
                    return false;
            }
            for(int i=0;i<pattern.length();i++){
                    char k= pattern.charAt(i);
                    //System.out.println("pattern: "+k);
                     //System.out.println("s: "+str[i]);
                    if(h1.containsKey(k)==true){
                            //System.out.println(h1.get(k).equals(str[i]));
                            if(h1.get(k).equals(str[i])==false){
                                    return false;
                            }
                            else{
                                    continue;
                            }
                    }
                    else{
                            h1.put(k,str[i]);
                    }
                    
            }
            //System.out.println("::::");
            for(int i=0;i<pattern.length();i++){
                    String k=str[i];
                    char x=pattern.charAt(i);
                    //System.out.println("s: "+k);
                     //System.out.println("pattren: "+str[i]);
                    if(h2.containsKey(k)==true){
                            if(h2.get(k)!=x){
                                    return false;
                            }
                    }
                    else{
                            h2.put(k,x);
                    }
            }
            return true;
        
    }
}