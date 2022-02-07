class Solution {
    public boolean backspaceCompare(String s, String t) {
            Stack<Character>s1=new Stack<>();
            Stack<Character>t1=new Stack<>();
            for(int i=0;i<s.length();i++){
                    char cur=s.charAt(i);
                    if(cur=='#'){
                            if(s1.isEmpty()==false){
                                    s1.pop();
                            }
                    }
                    else{
                            s1.push(cur);
                    }
            }
            String s2="";
            while(s1.isEmpty()==false){
                    s2+=s1.pop();
            }
            // System.out.println("s-"+ s2);
            for(int i=0;i<t.length();i++){
                     char cur=t.charAt(i);
                    if(cur=='#'){
                            if(t1.isEmpty()==false){
                                    t1.pop();
                            }
                    }
                    else{
                            t1.push(cur);
                    }
                    
            }
            String t2="";
            while(t1.isEmpty()==false){
                    t2+=t1.pop();
            }
            // System.out.println("t-"+ t2);
            //  System.out.println();
            return t2.equals(s2);
            
        
    }
}