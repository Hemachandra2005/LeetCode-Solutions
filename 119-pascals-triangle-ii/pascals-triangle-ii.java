class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> ans=new ArrayList<>();
        int [][] dp=new int[row+1][row+1];
        for(int r=0;r<=row;r++){
            for(int c=0;c<=r;c++){
                if( c==0 || c==r) dp[r][c]=1;
                else dp[r][c]=dp[r-1][c-1]+dp[r-1][c];
            }
        }
        int n=row+1;
        for(int i=0;i<=row;i++){
            ans.add(dp[row][i]);
        }
        return ans;

        
    }
}