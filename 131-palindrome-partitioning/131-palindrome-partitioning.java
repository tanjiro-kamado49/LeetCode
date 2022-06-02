class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>ds=new ArrayList<>();
        func(s,0,ds,ans);
        return ans;
    }
    public static void func(String s ,int id,List<String>ds,List<List<String>> ans){
        if(id==s.length()){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=id;i<s.length();i++){
            if(isPalindrome(s,id,i)==true){
                ds.add(s.substring(id,i+1));
                func(s,i+1,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int st,int e){
        while(st<=e){
            if(s.charAt(st++)!=s.charAt(e--)) return false;
        }
        return true;
    }
}