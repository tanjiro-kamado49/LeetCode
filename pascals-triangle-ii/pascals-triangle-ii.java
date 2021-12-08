class Solution {
    static List<Integer> pascalTriangle(List<Integer> prev){
        if(prev==null){
            List<Integer>next=new ArrayList<>();
            next.add(1);
            return next;
        }
        List<Integer>next=new ArrayList<>();
        next.add(1);
        for(int i=1;i<prev.size();i++){
            next.add(prev.get(i)+prev.get(i-1));
            
        }
        next.add(1);
        return next;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer>cur=new ArrayList<>();
        List<Integer>prev=null;
        for(int i=0;i<=rowIndex;i++){          
            cur=pascalTriangle(prev);
              prev=cur;         
        }
        return cur;
      
    }
}