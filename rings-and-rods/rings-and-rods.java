class Solution {
    public int countPoints(String rings) {
            HashMap<Integer,String>hm=new HashMap<>();
            for(int i=1;i<rings.length();i++){
                    char x=rings.charAt(i-1);
                    int y=Character.getNumericValue(rings.charAt(i));
                    
                            hm.put(y,hm.getOrDefault(y,"")+x);
            }
          
            int count=0;
            for(Map.Entry<Integer,String>  map:hm.entrySet()){
                if(map.getValue().contains("B") && map.getValue().contains("R")&&map.getValue().contains("G")){
                               count++;
                       }
                    
                    
            }
            return count;
        
    }
}