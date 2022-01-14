class Solution {
    public int myAtoi(String s) {
            int ans;
            if(s==" "){
                    return 0;
                    
            }
            int i=0;
            int sign=1;
            while(i<s.length() && s.charAt(i)==' '){
                    i++;
            }
            if(i<s.length() &&( s.charAt(i)=='+'|| s.charAt(i)=='-')){
                    if(s.charAt(i++)=='-'){
                            sign=-1;
                    }
            }
            int res=0;
            while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    if(res>Integer.MAX_VALUE/10 || res==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7){
                            if(sign==-1){
                                    System.out.println(Integer.MIN_VALUE);
                                    return Integer.MIN_VALUE;
                            }
                            System.out.println(Integer.MAX_VALUE);
                            return Integer.MAX_VALUE;
                            
                    }
                    res=res*10+(s.charAt(i++)-'0');
            }
            return res*sign;
        
    }
}