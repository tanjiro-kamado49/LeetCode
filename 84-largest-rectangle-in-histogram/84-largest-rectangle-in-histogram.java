class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>s=new Stack<>();
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(!s.isEmpty()) left[i]=s.peek()+1;
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()) right[i]=n-1;
            else right[i]=s.peek()-1;
            s.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,heights[i]*(right[i]-left[i]+1));
        }
        return max;
    }
}