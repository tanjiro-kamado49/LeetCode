class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        for(int a:nums){
            n^=a;
        }
        return n;

    }
}