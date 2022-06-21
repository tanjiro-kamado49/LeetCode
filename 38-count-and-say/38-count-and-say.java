class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String s=countAndSay(n-1);
        StringBuilder ans=new StringBuilder();
         char prev=s.charAt(0);
            int c=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)!=s.charAt(j-1)){
                   ans.append(String.valueOf(c));
                    ans.append(prev);
                    prev=s.charAt(j);
                    c=1;
                }
                else c++;
            }
        ans.append(c);
        ans.append(prev);
        return ans.toString();  
    }
}

// class Solution 
// {
//     public String countAndSay(int n) 
//     {
//         if(n==1) 
//         { 
//             return "1";
//         }
//         String str=countAndSay(n-1);
//         StringBuilder ans=new StringBuilder();
//         char prev=str.charAt(0); 
//         int count=1;
//         for(int i=1;i<str.length();i++) 
//         {
//             if(str.charAt(i)==prev) 
//             {
//                 count++;
//             } 
//             else 
//             {
//                 ans.append(count);
//                 ans.append(prev);
//                 prev=str.charAt(i);
//                 count=1;
//             }
//         }
//         ans.append(count);
//         ans.append(prev); 
//         return ans.toString();
//     }
// }