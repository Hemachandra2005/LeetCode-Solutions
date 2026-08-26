class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int r=0;r<m;r++){
           if(grid[r][0]==1) dfs(r,0,grid);
           if(grid[r][n-1]==1) dfs(r,n-1,grid);
        }
        for(int c=0;c<n;c++){
           if(grid[0][c]==1) dfs(0,c,grid);
           if(grid[m-1][c]==1) dfs(m-1,c,grid);

        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void dfs(int r , int c,int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        if(r>=m||c>=n||r<0 || c<0|| grid[r][c]==0) return ;
        grid[r][c]=0;
        dfs(r-1,c,grid);
        dfs(r+1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
    }
}