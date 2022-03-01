class Solution {
    public double myPow(double x, int n) {
            long nn=n;
            double xn=x;
            double res=func(xn,Math.abs(nn));
            if(nn<0){
                    return 1/res;
            }
            return res;
            
           
            
        
    }
        double func(double x,long n){
           if(n==0) return 1.0;
            double xn1= func(x,n/2);
            double xn=xn1*xn1;
            if(n%2!=0){
                    xn=xn*x;
            }
            return xn;
                
        }
}