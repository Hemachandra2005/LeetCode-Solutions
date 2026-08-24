class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count=0;
        int rows[]=new int[n];
        int colums[]=new int[m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(mat[i][j]==1){
                rows[i]++;
            }

          }
            
        }
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(mat[i][j]==1){
                  colums[j]++;
                }

            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && rows[i]==1 && colums[j]==1 ){
                    count++;

                }
            }
        }
        return count;
        
    }
}