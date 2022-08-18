
class Solution {
    public int minSetSize(int[] arr) {
      Map<Integer,Integer> mp = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        int half=arr.length/2;
        int count=0;
        int total=arr.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
         for(Map.Entry map:mp.entrySet()){
             pq.add((int)map.getValue());
         }
        
        while(pq.isEmpty()==false){ 
            int x=pq.poll();
            // System.out.println(total);
            if(total>half){
                total-=x;
                count++;
                
            }
            else break;
            
        }
        // if(count==0) return 1;
        return count;
        

    }
}