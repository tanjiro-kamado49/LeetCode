class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact*=i;
            list.add(i);
            
        }
        list.add(n);
        k=k-1;
        String ans="";
        while(true){
            ans+=list.get(k/fact);
            list.remove(k/fact);
            if(list.size()==0) return ans;
            k=k%fact;
            fact=fact/list.size();
        }
        // return ans;
        
    }
}