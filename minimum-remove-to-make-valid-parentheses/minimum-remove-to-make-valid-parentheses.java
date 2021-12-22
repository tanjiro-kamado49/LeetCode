class Solution {
    public String minRemoveToMakeValid(String s) {
            int n=s.length();
            boolean take[]= new boolean[n];
            Stack<Integer>open=new Stack<>();
            for(int i=0;i<n;i++){
                    if(s.charAt(i)==')' && open.size()>0){
                            take[i]=true;
                            take[open.pop()]=true;
                            
                    }
                    if(s.charAt(i)=='('){
                            open.add(i);
                    }
            }
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<n;i++){
                    if(s.charAt(i)=='('|| s.charAt(i)==')'){
                            if(take[i]==true){
                                    ans.append(s.charAt(i));
                            }
                    }
                    else{
                            ans.append(s.charAt(i));
                    }
            }
            return ans.toString();
        
    }
}