class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>ans=new ArrayList<>();
        int maxfreq[]=word2freq(words2);
        for(String x:words1){
            int []freq=word1freq(x);
            int flag=0;
            for(int i=0;i<26;i++){
                if(freq[i]<maxfreq[i]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans.add(x);
            }
        }
        return ans;
    }
    public static int[] word1freq(String word2){
        int freq[]=new int[26];
        for(int i=0;i<word2.length();i++){
            freq[word2.charAt(i)-'a']++;
        }
        return freq;
    }
    public static int[] word2freq(String[]word2){
        int max[]=new int[26];
        for( String s:word2){
           int freq[]=word1freq(s);
            for(int i=0;i<26;i++){
                max[i]=Math.max(max[i],freq[i]);
            }
        }
        return max;
    }
}