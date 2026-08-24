class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int l=0,count=0;
        for(int r=0;r<=n-3;r++){
            char a=s.charAt(r);
            char b=s.charAt(r+1);
            char c=s.charAt(r+2);

            if( a !=b && b !=c && a !=c){
                count++;

            }
        }
        return count;
    }
}