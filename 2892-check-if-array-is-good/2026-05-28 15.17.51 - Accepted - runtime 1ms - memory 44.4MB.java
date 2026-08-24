class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        for(int n:nums){
            max=Math.max(max,n);

        }
        int [] freq = new int [max+1];
        for(int a:nums){
            freq[a]++;

        }
        if(freq[max] !=2){
            return false;
        }
        
        for(int i=1;i<max;i++){
           if( freq[i] !=1){
            return false;
           }
        }
        return true;
    }
}