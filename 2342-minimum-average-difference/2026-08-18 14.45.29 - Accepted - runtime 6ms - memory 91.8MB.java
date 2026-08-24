class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long sum=0;
        long[] ans=new long [n];
        for(int x:nums){
            sum+=x;
        }
        long left=0;
        for(int i=0;i<n;i++){
            left+=nums[i];
            long right=sum-left;
            long lefth=left/(i+1);
            long righth=(i ==n-1)?0:right/(n-i-1);
            long a=Math.abs(lefth-righth);
            ans[i]=a;
        }
        long min=ans[0];
        int id=0;
        for(int i=1;i<n;i++){
            if(min>ans[i]){
                min=ans[i];
                id=i;
            }
        }
        
        return id;
        
    }
}