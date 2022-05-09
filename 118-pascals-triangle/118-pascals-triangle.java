class Solution {
        public List<Integer> pascal(List<Integer> prev){
                List<Integer> next=new ArrayList<>();
                if(prev==null){
                        next.add(1);
                        return next;
                }
                next.add(1);
                for(int i=0;i<prev.size()-1;i++){
                        next.add(prev.get(i)+prev.get(i+1));
                }
                next.add(1);
                return next;
        }
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>>pa=new ArrayList<>();
            List<Integer> prev=null;
            for(int i=0;i<numRows;i++){
                    prev=pascal(prev);
                    pa.add(prev);
                    
            }
            return pa;
        
    }
}