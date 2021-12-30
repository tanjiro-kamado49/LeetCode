class Solution {
    public String multiply(String num1, String num2) {
          if(num1.equals("0") || num2.equals("0"))
                  return "0";
          StringBuffer sb = new StringBuffer();
            int arr[]=new int[num1.length()+num2.length()];
            for(int i=num1.length()-1;i>=0;i--){
                   int n1=num1.charAt(i)-'0';
                    for(int j=num2.length()-1;j>=0;j--){
                            int n2=num2.charAt(j)-'0';
                            int sum=arr[i+j+1]+n1*n2;
                            arr[i+j+1]=sum%10;
                            arr[i+j]+=sum/10;
                    }
            }
            int index=0;
            if(arr[0]==0){
                    index=1;
            }
            while(index<arr.length){
                    sb.append(arr[index++]);
            }
            return sb.toString();
    }
}