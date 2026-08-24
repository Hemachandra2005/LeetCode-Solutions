class Solution {
    public int maxPower(String s) {
        int n=s.length();
        
        int l=0,max=1;
        for(int r=1;r<n;r++){
            if(s.charAt(r) !=s.charAt(l)){
                l=r;
            }
            int len= (r-l)+1;
            max=Math.max(len,max);
        }
        return max;
        
    }
}