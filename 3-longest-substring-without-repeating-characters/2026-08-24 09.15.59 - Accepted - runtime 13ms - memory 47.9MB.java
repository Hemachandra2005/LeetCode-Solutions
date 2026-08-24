class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l=0,max=0;
       int n=s.length();
       int [] freq=new int[128];
       for(int r=0;r<n;r++){
        char c=s.charAt(r);
        freq[c]++;
        while(freq[c]>1){
            freq[s.charAt(l)]--;
            l++;
        }
        int len=((r-l)+1);
        max=Math.max(max,len);
       }
       return max;

        
    }
}