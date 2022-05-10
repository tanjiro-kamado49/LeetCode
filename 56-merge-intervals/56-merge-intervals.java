class Solution {
       // class Pair{
       //          int x;
       //         int y;
       //         pair(int x,int y){
       //                 this.x=x;
       //                 this.y=y;
       //         }
       //  }
    public int[][] merge(int[][] intervals) {
            List<int[]>list=new ArrayList<>();
             if(intervals.length==0 || intervals==null) return list.toArray(new int [0][]);
            Arrays.sort(intervals,(a, b) -> a[0]- b[0]);
            int st=intervals[0][0];
            int ed=intervals[0][1];
            for(int i=1;i<intervals.length;i++){
                    if(intervals[i][0]<=ed){
                            if(intervals[i][1]>ed){
                                    ed=intervals[i][1];
                            }
                    }
                    else{
                            int pair[]=new int[2];
                            pair[0]=st;
                            pair[1]=ed;
                            list.add(pair);
                            st=intervals[i][0];
                            ed=intervals[i][1];
                    }
            }
            int pair[]=new int[2];
            pair[0]=st;
            pair[1]=ed;
            list.add(pair);
            return list.toArray(new int[0][]);
            
            
            
        
    }
}