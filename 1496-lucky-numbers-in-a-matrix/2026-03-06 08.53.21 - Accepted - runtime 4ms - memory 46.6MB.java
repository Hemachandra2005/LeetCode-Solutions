class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> lucky=new ArrayList<>();
        int[] minrow=new int[m];
        int[] maxcol=new int[n];
        Arrays.fill(minrow,Integer.MAX_VALUE);
        Arrays.fill(maxcol,Integer.MIN_VALUE);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                minrow[i]=Math.min(minrow[i],matrix[i][j]);
                maxcol[j]=Math.max(maxcol[j],matrix[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==minrow[i] && matrix[i][j]==maxcol[j]){
                    lucky.add(matrix[i][j]);
                }
            }
        }
        return lucky;
    }
}