class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        int i=0;
        if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='[')
            stack.push(s.charAt(i));
        else return false;
        i++;
        while(i<s.length()){
            char x=s.charAt(i++);
            if(x=='(' || x=='{' ||x=='['){
                stack.push(x);
                System.out.println(stack.peek());
            }
            else{
                if(stack.isEmpty())return false;
                switch(x){
                       case ')' :if(stack.peek()=='(') stack.pop();
                             else return false;
                             break;
                       case '}':if(stack.peek()=='{') stack.pop();
                             else return false;
                             break;
                       case ']':if(stack.peek()=='[') stack.pop();
                             else return false;
                }
            }
           
        }
        if(stack.isEmpty()) return true;
        return false;
        
        
    }
}