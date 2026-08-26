class Solution {
     
    
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        int longest=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]==1){
                    int x=dfs(r,c,grid,m,n);
                   longest=Math.max(x,longest);
                }
            }
        }
        return longest;

    
    }
    public static int dfs(int r,int c,int[] [] grid,int m,int n){
        if(r<0 || c<0 || r>=m || c>=n || grid[r][c]==0) return 0;
        grid[r][c]=0;

        int left=dfs(r,c-1,grid,m,n);
        int right=dfs(r,c+1,grid,m,n);
        int top=dfs(r+1,c,grid,m,n);
        int down=dfs(r-1,c,grid,m,n);

        return 1+left+right+top+down;

    }
}