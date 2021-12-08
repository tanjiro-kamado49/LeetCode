class Solution {
    public int longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int ans=0;
         int count=1;
        if(s.length()==1){
            return 1;
        }
        System.out.println(ch);
        for(int i=0;i<ch.length-1;i++){
           
            if(ch[i]==ch[i+1]){
                count++;
            }
            else{
                if(count>1){
                     if(count%2==0){
                         //System.out.println("count "+count);
                          ans+=count;
                         // System.out.println("ans--- "+ans);
                     }
                    else{
                        //System.out.println("count "+count);
                        ans+=(count-1);
                        //System.out.println("ans--- "+ans);
                    }
                    
                }
               
                count=1;
            }    
        }
       // System.out.println("count "+count);
        if(count>1){
           if(count%2==0){
            ans+=count;
           }
            else{
                  ans+=(count-1);      
            }
        }
       // System.out.println("ans--- "+ans);
        if(ans<ch.length){
            ans++;
        }
        return ans;
        
    }
}