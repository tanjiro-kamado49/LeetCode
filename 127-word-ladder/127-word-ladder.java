class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            boolean check=false;
            for(int i=0;i<wordList.size();i++){
                    if(endWord.equals(wordList.get(i))==true){
                            check=true;
                    }
            }
            if(check==false) return 0;
            HashMap<String,List<String>>hm=new HashMap<>();
            wordList.add(beginWord);
            for(String word : wordList){
                  
                    for(int i=0;i<word.length();i++){
                            String pattern=word.substring(0,i)+"*"+word.substring(i+1,word.length());
                            // System.out.println("pattern -"+pattern);
                            if(hm.get(pattern)==null){
                                     hm.put(pattern,new ArrayList<String>());       
                            }
                            List<String>temp=hm.get(pattern);
                           temp.add(word);
                            hm.put(pattern,temp);
                             // System.out.println("pattern -"+pattern+" "+temp);
                    }
            }
            HashSet<String>visit=new HashSet<>();
            Deque<String>q=new ArrayDeque<>();
            q.add(beginWord);
            visit.add(beginWord);
            int res=1;
            // System.out.println("-------------------");
            while(q.isEmpty()==false){
                    int size=q.size();
                    while(size-->0){
                    String word=q.poll();
                    // System.out.println("word-"+word);
                    if(word.equals(endWord)==true){
                            return res;
                    }
                    for(int i=0;i<word.length();i++){
                            String pattern=word.substring(0,i)+"*"+word.substring(i+1,word.length());
                              // System.out.println("pattern-"+pattern);
                            List<String> st=new ArrayList<>(hm.get(pattern));
                            // System.out.println("stlist- "+st);
                            for(int j=0;j<st.size();j++){
                                     // System.out.println("st " +st.get(j));
                                    if(visit.contains(st.get(j))==false){
                                          
                                           
                                            visit.add(st.get(j));
                                            q.add(st.get(j));
                                              // System.out.println("Set-"+visit);
                                    }
                            }
                            
                           
                            
                            
                    }
                    }           
                     
                     // System.out.println("queue-"+q);
                    res+=1;
                    // System.out.println("res-"+res+"\n"+"----------------------------------------------");
            }
            return 0;
        
    }
}