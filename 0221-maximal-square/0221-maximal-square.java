class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int input[][]=new int[m][n];
        

        int dp[][]=new int[m][n];
        int ans=0;
      
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(matrix[r][c]=='1'){
                if(r==0 || c==0) dp[r][c]=1;
                else dp[r][c]=1+Math.min(dp[r-1][c-1],Math.min(dp[r-1][c],dp[r][c-1]));
                ans=Math.max(ans,dp[r][c]);
                }
            }
        }
        return ans*ans;
        
    }
}