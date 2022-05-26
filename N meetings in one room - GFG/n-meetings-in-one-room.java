// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class meeting  {
       int st;
       int ed;
       int id;
       public  meeting(int st,int ed,int id){
           this.st=st;
           this.ed=ed;
           this.id=id;
           
       }
   }
   
    class compareclass implements Comparator<meeting>{
        @Override
        public int compare(meeting o1, meeting o2){
            if(o1.ed>o2.ed) return 1;
            else if(o1.ed<o2.ed) return -1;
            else if(o1.id>o2.id) return 1 ;
            return -1;
        }
       
   }
class Solution 
{
   
    public static int maxMeetings(int start[], int end[], int n)
    {
        List<meeting>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            meeting s=new meeting(start[i],end[i],i+1);
            list.add(s);
        }
        compareclass cs=new compareclass();
        Collections.sort(list,cs);
        int count=1;
        int preved=list.get(0).ed;
        for(int i=1;i<list.size();i++){
            if(list.get(i).st>preved) {
                count++;
               preved=list.get(i).ed;
            }
            
        }
        return count;
    }
}
