class Solution {
    public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer>stack=new Stack<>();
            for(int i=0;i<asteroids.length;i++){
                    if(stack.isEmpty()==true){
                            stack.push(asteroids[i]);
                    }
                    else{
                            if(stack.peek()>0 && asteroids[i]>0){
                                    stack.push(asteroids[i]);       
                            }
                            else if(stack.peek()<0 && asteroids[i]<0){
                                    stack.push(asteroids[i]);
                                    
                            }
                            else{  boolean flag=true;
                                    while(stack.isEmpty()==false){
                                            if((stack.peek()>0 && asteroids[i]<0)){
                                                    if(Math.abs(stack.peek())<Math.abs(asteroids[i])){
                                                            stack.pop();
                                                            
                                                    } 
                                                    else if(Math.abs(stack.peek())==Math.abs(asteroids[i])){
                                                             flag=false;
                                                            stack.pop();
                                                            break;
                                                            
                                                            
                                                    }
                                                    else{
                                                            flag=false;
                                                            break;
                                                            
                                                    }
                                                    
                                            }
                                            else{
                                                    break;
                                            }
                                    }
                                 if(flag==true){
                                         stack.push(asteroids[i]);
                                 }
                            }
                            
                    }            
        }
            if(stack.size()==0){
                   int ans[]=new int[0];
                    return ans;
            }
            int ans[]=new int[stack.size()];
            int x=stack.size()-1;
            while(stack.isEmpty()==false){
                    ans[x--]=stack.pop();
            }
            // Arrays.reverse()
            return ans;
        
    }
}