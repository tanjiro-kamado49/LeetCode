class Solution {
    public int countPoints(String rings) {
            HashMap<Integer,String>hm=new HashMap<>();
            for(int i=0;i<rings.length();i=i+2){
                    int num=Character.getNumericValue(rings.charAt(i+1));
                    char color=rings.charAt(i);
                    hm.put(num,hm.getOrDefault(num,"")+color);
                    
            }
            int count=0;
               for (Map.Entry<Integer,String> map : hm.entrySet()) {
                       if(map.getValue().contains("B") && map.getValue().contains("R")&&map.getValue().contains("G")){
                               count++;
                       }
        }
                       return count;
        
    }
}