class Solution {
    public int[][] kClosest(int[][] points, int k) {
            int ans[][]=new int[k][2];
            PriorityQueue<Point> pq = new PriorityQueue<Point>((a, b) -> (a.area - b.area));
            for(int[] coord : points) {
            pq.add(new Point(coord));
        }
            
        for(int i = 0; i < k; i++) {
            Point point = pq.poll();
            ans[i] = point.cord;
        }
        
        return ans;
        
    }
        class Point{
                int []cord;
                int area;
                Point(int cord[]){
                        this.cord=cord;
                        this.area = (int)(Math.pow(cord[0], 2) + Math.pow(cord[1], 2));
                }
        }
}