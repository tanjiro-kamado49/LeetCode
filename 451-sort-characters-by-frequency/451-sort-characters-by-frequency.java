class Solution {
        public class Pair implements Comparable<Pair>{
                char character;
                int fq;
                Pair(char character,int fq){
                        this.character=character;
                        this.fq=fq;
                        
                }
                
                public int compareTo(Pair o){
                      return this.fq - o.fq;
                }
        }
    public String frequencySort(String s) {
            PriorityQueue<Pair>pq=new PriorityQueue<>();
            HashMap<Character,Integer>hm=new HashMap<>();
            for(int i=0;i<s.length();i++){
                    char c=s.charAt(i);
                    if(hm.containsKey(c)==true){
                             hm.put(c,hm.get(c)+1);
                    }
                    else{
                            hm.put(c,1);
                    }
            }
            for(char key:hm.keySet()){
                    Pair p=new Pair((char)key,hm.get(key));
                    pq.add(p);
            }
            StringBuilder ans=new StringBuilder();
            while(pq.isEmpty()==false){
                    Pair p=pq.remove();
                    char c=p.character;
                    int k=p.fq;
                    for(int j=0;j<k;j++){
                            ans.append(c);
                    }
                    
            }
            return ans.reverse().toString();
            
        
    }
}