class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> hm=new HashMap<>();
            List<List<String>>ans=new ArrayList<List<String>>();
            for(String s:strs){
                    char[]ch=s.toCharArray();
                    Arrays.sort(ch);
                    String k=String.valueOf(ch);
                    if(!hm.containsKey(k)){
                            hm.put(k,new ArrayList<String>());
                    }
                    hm.get(k).add(s);
            }
        for(String x:hm.keySet()){
                ans.add(hm.get(x));
        }
            return ans;
        
    }
}