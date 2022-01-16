class Solution {
   
    public int tribonacci(int n) {
           // if(n==0) return 0;
        int fn[]=new int[n+1];
            fn[0]=0;
            if(n>0){
              fn[1]=1;
                    if(n>1)
                        fn[2]=1;
            }
            for(int i=3;i<=n;i++){
                    fn[i]=fn[i-1]+fn[i-2]+fn[i-3];
            }
           // System.out.println( fn[n]);
            return fn[n];
    }
    
}