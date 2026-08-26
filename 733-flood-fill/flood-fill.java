class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int in=image[sr][sc];
        if(in!=color){
            dfs(image,sr,sc,color,in);
        }
        return image;
      
    }
    public static void dfs(int [][] image,int r,int c,int color,int in){
        int m=image.length;
        int n=image[0].length;
        if(r<0 || c<0 || r>=m || c>=n || image[r][c]!=in) return ;
        image[r][c] = color;
        dfs(image,r+1,c,color,in);
        dfs(image,r,c+1,color,in);
        dfs(image,r,c-1,color,in);
        dfs(image,r-1,c,color,in);

    }
}