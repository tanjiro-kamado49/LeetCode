class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        char d=s.charAt(n-1);
        int sum=0;
        if(d=='I') sum+=1;
        else if(d=='V') sum+=5;
        else if(d=='X') sum+=10;
        else if(d=='L') sum+=50;
        else if(d=='C') sum+=100;
        else if(d=='D') sum+=500;
        else sum+=1000;
        for(int i=n-2;i>=0;i--){
            d=s.charAt(i);
            char p=s.charAt(i+1);
            if(d=='I'){
                if(p=='V'||p=='X'|| p=='L'||p=='C'|| p=='D'||p=='M' ){
                    sum-=1;
                }
                else sum+=1;
            }
            else if(d=='V'){
                 if(p=='X'|| p=='L'||p=='C'|| p=='D'||p=='M' ){
                    sum-=5;
                }
                else sum+=5;
                
            }
            else if(d=='X'){
                 if(p=='L'||p=='C'|| p=='D'||p=='M' ){
                    sum-=10;
                }
                else sum+=10;
                
            }
            else if(d=='L'){
                 if(p=='C'|| p=='D'||p=='M' ){
                    sum-=50;
                }
                else sum+=50;
                
            }
            else if(d=='C'){
                 if( p=='D'||p=='M' ){
                    sum-=100;
                }
                else sum+=100;
                
            }
            else if(d=='D'){
                 if(p=='M' ){
                    sum-=500;
                }
                else sum+=500;
                
            }
            else{
                sum+=1000;
            }
        }
        return sum;
        
    }
}