class Solution {
    public void func(int id,String digits,Map<Character,List<Character>>hm,List<String>ans,StringBuilder st){
        if(id==digits.length()){
            ans.add(st.toString());
            return;
            
        }
        
        for(int i=0;i<hm.get(digits.charAt(id)).size();i++){
            func(id+1,digits,hm,ans,st.append(hm.get(digits.charAt(id)).get(i)));
             st.deleteCharAt(st.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        Map<Character,List<Character>>hm=new HashMap<>();
       
        hm.put('2',Arrays.asList('a','b','c'));
        hm.put('3',Arrays.asList('d','e','f'));
        hm.put('4',Arrays.asList('g','h','i'));
        hm.put('5',Arrays.asList('j','k','l'));
        hm.put('6',Arrays.asList('m','n','o'));
        hm.put('7',Arrays.asList('p','q','r','s'));
        hm.put('8',Arrays.asList('t','u','v'));
        hm.put('9',Arrays.asList('w','x','y','z'));
        List<String>ans=new ArrayList<>();
        if(digits.equals("")) return ans;
        StringBuilder st=new StringBuilder();
        func(0,digits,hm,ans,st);
        return ans;
    }
}