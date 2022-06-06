// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}
// } Driver Code Ends


class solve {
    public static boolean isSafe(int node,boolean graph[][],int color[],int n,int col){
        for(int k=0;k<n;k++){
            if(node!=k && graph[k][node]==true && color[k]==col){
                 return false;
            }
        }
        return true;
    }
    public static boolean isFunc(int node,boolean [][]graph,int[]color,int m,int n){
        if(node==n) return true;
        for(int i=1;i<=m;i++){
            if(isSafe(node,graph, color,n,i)==true){
                color[node]=i;
                if(isFunc(node+1,graph,color,m,n)==true)return true;
                color[node]=0;
            }
        }
        return false;
    }
  
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int color[]=new int[n];
        Arrays.fill(color,0);
        if(isFunc(0,graph,color,m,n)) return true;
        return false;

    }
}