class Solution {
    public int compareVersion(String version1, String version2) {
            String[]revision1=version1.split("\\.");
            String[]revision2=version2.split("\\.");
            // System.out.println(revision1[0]);
            int max=Math.max(revision1.length,revision2.length);
            for(int i=0;i<max;i++){
                    int num1=0;
                    int num2=0;
                    if(i<revision1.length){
                            num1=Integer.parseInt(revision1[i]);
                            
                    }
                    if(i<revision2.length) num2=Integer.parseInt(revision2[i]);
                    
                    if(num1>num2) return 1;
                    if(num2>num1) return -1;
                  
            }
            return 0;     
    }
}