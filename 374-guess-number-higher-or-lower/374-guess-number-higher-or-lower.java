/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long low=1;
        long high=n;
        while(low<=high){
            long mid=(long)(low+high);
            mid=mid/2;
            int m=(int)mid;
            int x=guess(m);
            if(x==-1) high=m-1;
            else if(x==1) low=m+1;
            else return m;
            
        }
        return -1;
        

        
    }
}