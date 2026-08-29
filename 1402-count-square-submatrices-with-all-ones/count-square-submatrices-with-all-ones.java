class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][] dp=new int[m][n];
        int ans=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(matrix[r][c]==1){
                    if(r==0 || c==0) dp[r][c]=1;
                    else{
                        dp[r][c]=1+Math.min(dp[r-1][c],Math.min(dp[r-1][c-1],dp[r][c-1]));
                       
                    }
                    
                }

            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans+=dp[i][j];
            }
        }
        return ans;
        
    }
}