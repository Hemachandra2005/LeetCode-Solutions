class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> triangle=new ArrayList<>();
        int[][] dp=new int[rows][rows];
        
        for(int r=0;r<rows;r++){
         List<Integer> ans=new ArrayList<>();
         for(int c=0;c<=r;c++){
            if(c==0 || c==r) dp[r][c]=1;
            else dp[r][c]=dp[r-1][c-1]+dp[r-1][c];
            ans.add(dp[r][c]);
         }
         triangle.add(ans);    
        }
        return triangle;

        
        
        
    }
    
}