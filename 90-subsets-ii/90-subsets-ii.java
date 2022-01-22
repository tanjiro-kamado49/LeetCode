class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
           Set<List<Integer>> set=new HashSet<>();
             List<List<Integer>> res=new ArrayList<>();
            List<Integer>empty=new ArrayList<>();
            res.add(empty);
            int n=nums.length;
            Arrays.sort(nums);
            for(int i=0;i<n;i++){
                    int el=nums[i];
                    //System.out.println("element: "+el);
                    int len=res.size();
                    for(int j=0;j<len;j++){
                           
                            List<Integer>temp=new ArrayList<>(res.get(j));
                              //System.out.println("prev: "+temp);
                            temp.add(el);
                            //System.out.println("not fixed: "+temp);
                            if(set.contains(temp)==false){
                                    //System.out.println("add"+temp);
                                     res.add(temp);
                                    set.add(temp);
                                    
                            }
                               
                            
                    }
            }
           
            return res;
        
    }
}