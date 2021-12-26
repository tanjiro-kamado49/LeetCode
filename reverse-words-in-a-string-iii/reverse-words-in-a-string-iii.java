class Solution {
    public String reverseWords(String s) {
      char[]arr=s.toCharArray();
        int st=0;
        int e=s.length()-1;
        for(int i=0;i<e+1;i++){
            if(arr[i]== ' '){
                reverse(arr,st,i-1);
                st=i+1;
            }
        }
        reverse(arr,st,e);
        return new String(arr);
    }
    public static void reverse(char []arr,int i,int j ){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
}