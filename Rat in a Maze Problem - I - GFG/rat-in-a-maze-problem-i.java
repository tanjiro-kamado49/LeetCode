// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void solve(int i,int j,ArrayList<String>ans,int [][]visit,String move,int m[][],int n,int[]di,int dj[]){
        if(i==n-1 && j==n-1) {
            ans.add(move);
            return ;
        }
        String str="DLRU";
        for(int k=0;k<4;k++){
            int ni=i+di[k];
            int nj=j+dj[k];
            if(ni>=0 && nj>=0 && ni<n && nj<n && m[ni][nj]==1 && visit[ni][nj]==0 ){
                visit[i][j]=1;
                solve(ni,nj,ans,visit,move+str.charAt(k),m,n,di,dj);
                visit[i][j]=0;
            }
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        int visit[][]=new int[n][n];
        ArrayList<String>ans=new ArrayList<>();
        int di[]={1,0,0,-1};
        int dj[]={0,-1,1,0};
        if(m[0][0]==1) solve(0,0,ans,visit,"",m,n,di,dj);
        return ans;
    }
}