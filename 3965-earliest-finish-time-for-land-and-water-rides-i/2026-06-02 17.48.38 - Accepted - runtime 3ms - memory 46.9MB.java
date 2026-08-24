class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){

                int landfinish =landStartTime[i]+landDuration[i];
                int waterbegin =Math.max(landfinish,waterStartTime[j]);
                int end1= waterbegin+waterDuration[j];
                ans=Math.min(end1,ans);

                int waterfinish = waterStartTime[j]+waterDuration[j];
                int landbegin=Math.max(waterfinish,landStartTime[i]);
                int end2=landbegin+landDuration[i];
                ans=Math.min(end2,ans);


            }
        }
        return ans;
        
    }
}