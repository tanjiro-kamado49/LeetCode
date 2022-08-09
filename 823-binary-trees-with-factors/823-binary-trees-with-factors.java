class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer,Long>hm=new HashMap<>();
        Arrays.sort(arr);
        long ans=1;
        hm.put(arr[0],1L);
        for(int i=1;i<arr.length;i++){
            long sum=1;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 && hm.containsKey(arr[i]/arr[j])){
                    sum+=(hm.get(arr[j])*hm.get(arr[i]/arr[j]));
                }
            }
            hm.put(arr[i],sum);

            ans+=sum;
        }
        return (int)(ans%1000000007);
        
    }
}