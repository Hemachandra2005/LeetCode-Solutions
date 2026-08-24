class Solution {
    public int mySqrt(int x) {
        int ans=0;
        while((long)(ans+1)*(ans+1) <=x){
            ans++;
        }
        return ans;
    }
}