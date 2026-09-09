class Solution {

    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int index=0;
        boolean ans=false;
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(board[r][c]==word.charAt(0)){
                    if(dfs(board,r,c,word,index)) return true;
                }
            }
        }

        return false;

      

    }

    public static boolean dfs(char [][]board,int r,int c,String w,int index){
        int x=w.length();
        int n=board.length;
        int m=board[0].length;
        if(index==x) return true;
        if(r>=n || r<0 || c>=m || c<0 || board[r][c] !=w.charAt(index)) return false;

        char temp=board[r][c];
        board[r][c]='!';
        boolean nswer=dfs(board,r+1,c,w,index+1)||dfs(board,r-1,c,w,index+1)||dfs(board,r,c+1,w,index+1)||dfs(board,r,c-1,w,index+1);

        board[r][c]=temp;

        return nswer;





    }
}