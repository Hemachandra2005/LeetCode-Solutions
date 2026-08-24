class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int [][] ab=new int[n][2];
        for(int i=0;i<n;i++){
            ab[i][0]=arr[i];
            ab[i][1]=Integer.bitCount(arr[i]);
            

        }
        Arrays.sort(ab,(a,b)->
            a[1]!=b[1]?a[1]-b[1]:a[0]-b[0]
        );
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=ab[i][0];

        }
        return ans;


        
    }
}