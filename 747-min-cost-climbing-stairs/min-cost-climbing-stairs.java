class Solution {
    public int minCostClimbingStairs(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        int[]dp=new int[n];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+nums[i];
        }
        return Math.min(dp[n-1],dp[n-2]);
        
    }
}