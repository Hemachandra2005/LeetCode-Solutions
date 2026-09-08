class Solution {
    public int countCommas(int n) {
        int count=1;
        if(n<1000) return 0;
        else{
            int a=n-1000;
            return a+1;
        }
        
    }
}