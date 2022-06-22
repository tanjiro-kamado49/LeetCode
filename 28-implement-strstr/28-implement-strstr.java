class Solution {
    public int strStr(String s, String p) {
        int i=1;
        int j=0;
        int n=s.length();
        int m=p.length();
        int pi[]=new int[m];
        while(i<m){
            if(p.charAt(i)==p.charAt(j)){
                pi[i]=j+1;
                i++;
                j++;
            }
            else if(j>0){
                j=pi[j-1];
                
            }
            else{
                pi[i]=0;
                i++;
            }
        }
        i=0;
        j=0;
        // int ans=0;
        while(i<n){
            if(s.charAt(i)==p.charAt(j)){
                if(j==m-1){
                    return i-j;
                }
                else{
                    i++;
                    j++;
                }
            }
            else if(j>0){
                j=pi[j-1];
            }
            else{
                i++;
            }
            
        }
        return -1;
        
        
    }
}