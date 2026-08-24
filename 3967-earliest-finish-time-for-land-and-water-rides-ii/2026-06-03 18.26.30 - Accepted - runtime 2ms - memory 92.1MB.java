class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landmin=Integer.MAX_VALUE;
        int ans1=Integer.MAX_VALUE;
       for(int i=0;i<landStartTime.length;i++){
         landmin=Math.min(landmin,landStartTime[i]+landDuration[i]);
         
       } 
       for(int j=0;j<waterStartTime.length;j++){
        int wd=Math.max(landmin,waterStartTime[j])+waterDuration[j];
        ans1=Math.min(ans1,wd);
       }

       int watermin=Integer.MAX_VALUE;
       int ans2=Integer.MAX_VALUE;
       for(int k=0;k<waterStartTime.length;k++){
        watermin=Math.min(watermin,waterStartTime[k] +waterDuration[k]);

       }

       for(int l=0;l<landStartTime.length;l++){
        int ld=Math.max(watermin,landStartTime[l]) +landDuration[l];
        ans2=Math.min(ans2,ld);

       }

       int ans=Math.min(ans1,ans2);

       return ans;

        
    }
}