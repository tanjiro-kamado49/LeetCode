// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int nums[], int n) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],0);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j){
                    if(hm.containsKey(nums[i]+nums[j])==true){
                        hm.put(nums[i]+nums[j],hm.getOrDefault(nums[i]+nums[j],0)+1);
                    }
                }
                
            }
        }
        int ans=0;
        for (Map.Entry mapElement : hm.entrySet()) {
            int value = (int)mapElement.getValue();
            if(value>0){
                ans+=value;
            }
 
        }
        return ans;
    }
}