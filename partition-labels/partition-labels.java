class Solution {
    public List<Integer> partitionLabels(String s) {
            HashMap<Character,Integer>hm=new HashMap<>();
            for(int i=0;i<s.length();i++){
                    hm.put(s.charAt(i),i);
            }
            List<Integer>ans=new ArrayList<>();
            int start=0;
            int e=0;
            for(int i=0;i<s.length();i++){
                    e=Math.max(e,hm.get(s.charAt(i)));
                    if(e==i){
                            ans.add(e-start+1);
                            start=i+1;
                    }
            }
            return ans;
        
    }
}