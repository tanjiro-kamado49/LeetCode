// { Driver Code Starts
import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] inputline = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputline[0]);
            inputline = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputline[i]);
            }
            Solution ob =new Solution();
            int[] res = ob.maxOfMin(arr, n);
            
            for (int i = 0; i < n; i++) 
                System.out.print (res[i] + " ");
            System.out.println ();
        }
    }
}// } Driver Code Ends



class Solution 
{
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] a, int n) 
    {
            //  0 1 2 3 4
        //    3 3 4 2 4  
        
        // ans- 4  3 3 2  2
        // r-l-2
        

        
        
        // 3->  r->3   l->-1
            
        // left-> -1 -1 1 -1 3
        // right-> 3  3  3 5  5
        
        //      elm    window size
            //  3       3
            // 3         3
            // 4           1
            //   2         5
            // 4            1
            
            
            // 1  2   3       4   5
                            
            // 4    3    3    2   2
            
            //  first find the  maxm window size for each elm
            Stack<Integer>s=new Stack<>();
            int left[]=new int[n];
            int right[]=new int[n];
            Arrays.fill(left,-1);
            Arrays.fill(right,n);
            for(int i=0;i<n;i++){
                while(!s.isEmpty() && a[s.peek()]>=a[i]) s.pop();
                if(!s.isEmpty()) left[i]=s.peek();
                s.push(i);
            }
            s.clear();
              for(int i=n-1;i>=0;i--){
                while(!s.isEmpty() && a[s.peek()]>=a[i]) s.pop();
                if(!s.isEmpty()) right[i]=s.peek();
                s.push(i);
            }
            
            // add all the elemnets to ans arr
            int ans[]=new int[n];
            Arrays.fill(ans,0);
            for(int i=0;i<n;i++){
                int pos=right[i]-left[i]-2;
                ans[pos]=Math.max(ans[pos],a[i]);
            }
            for(int i=n-2;i>=0;i--){
                ans[i]=Math.max(ans[i],ans[i+1]);
            }
            return ans;
            
            
            
        
       
    }
}