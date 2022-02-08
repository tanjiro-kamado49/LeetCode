class Solution {
    public int addDigits(int num) {
            if(num<=9) return num;
            int cur=num;
            int sum=0;
            while(true){
                    while(cur!=0){
                            int rem=cur%10;
                            sum+=rem;
                            cur=cur/10;
                    }
                    if(sum<=9) return sum;
                    cur=sum;
                    sum=0;
            }
            // return 0;
        
    }
}