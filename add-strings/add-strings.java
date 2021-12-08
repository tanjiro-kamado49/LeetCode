class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 ){
            int x=0;
            int y=0;
            if(i>=0){
                x=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                 y=num2.charAt(j)-'0';
                j--;
            }
            int n=(x+y+carry)%10;
            carry=(x+y+carry)>=10?1:0;
            sb.append(n);
        }
        if(carry==1){
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
        
    }
}