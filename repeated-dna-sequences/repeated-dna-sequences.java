class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
            List<String>ans=new ArrayList<>();
            HashMap<String,Integer>hm=new HashMap<>();
            for(int i=0;i<=s.length()-10;i++){
                    String temp=s.substring(i,i+10);
                    hm.put(temp,hm.getOrDefault(temp,0)+1);
            }
            //System.out.println(hm);
            for(String x:hm.keySet()){
                    if(hm.get(x)>1){
                            ans.add(x);
                    }
            }
            return ans;
                      
    }
}