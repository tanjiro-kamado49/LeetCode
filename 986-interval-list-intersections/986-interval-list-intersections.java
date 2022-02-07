class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            int i=0;
            int j=0;
            ArrayList<int[]>ans=new ArrayList<>();
            while(i<firstList.length && j< secondList.length){
                    int arr[]=new int[2];
                    if(secondList[j][0]<=firstList[i][1] && secondList[j][0]>=firstList[i][0]){
                            arr[0]=secondList[j][0];
                            arr[1]=Math.min(secondList[j][1],firstList[i][1]);
                            ans.add(arr);
                    }
                    else if(secondList[j][0]<=firstList[i][0] && secondList[j][1]>=firstList[i][0]){
                             arr[0]=firstList[i][0];
                            arr[1]=Math.min(secondList[j][1],firstList[i][1]);
                            ans.add(arr);
                            
                    }
                    if(secondList[j][1]>=firstList[i][1]){
                            i++;
                            
                    }
                    else{
                            j++;
                    }
            }
            return ans.toArray(new int[ans.size()][]);
        
    }
}