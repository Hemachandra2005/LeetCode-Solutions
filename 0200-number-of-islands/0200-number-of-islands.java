class Solution {
    static int m;
    static int n;
    static boolean visited[][];
 

    public int numIslands(char[][] grid) {
        m=grid.length;
        n=grid[0].length;
        visited=new boolean[m][n];
        int count=0;

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]=='1' && visited[r][c]==false){
                    count++;
                    dfs(r,c,grid);
                }
            }
        }

        return count; 
        
    }
    public static void dfs(int r,int c,char grid[][]){
        if(r<0 || c<0 || r>=m || c>=n) return ;
        if(visited[r][c]==true || grid[r][c]=='0') return ;

        visited[r][c]=true;

        dfs(r+1,c,grid);
        dfs(r,c+1,grid);
        dfs(r-1,c,grid);
        dfs(r,c-1,grid);

    }
}