class Solution {
           public class Pair implements Comparable<Pair>
    {
        int num;
        int count;
       public Pair(int num,int count)
       {
            this.num=num;
            this.count=count;
       }
       public int compareTo(Pair o)
        {
        return this.count - o.count;
        }
         
    }
    public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer>hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                    if(hm.containsKey(nums[i])==true){
                            hm.put(nums[i],hm.get(nums[i])+1);
                    }
                     else{
                             hm.put(nums[i],1);
                     }
                   
            }
           PriorityQueue<Pair> pq =new PriorityQueue<>();
             for(int key:hm.keySet())
        {
            Pair p=new Pair(key,hm.get(key));
            if(pq.size()<k)
            {
                pq.add(p);
            }
            else
            {
                Pair curr=pq.peek();
                
                    if(p.count>curr.count)
                {   
                    pq.remove(curr);
                    pq.add(p);
                
                }
            }
        }
           int ans[]=new int[k];
            for(int i=0;i<k;i++){
                    Pair curr=pq.poll();
                    ans[i]=curr.num;
            }
            return ans;
        
    }
}