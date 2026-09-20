class Solution {
    public int reverseDegree(String s) {
        int index=0,revindex=0;
        char [] word=s.toCharArray();
        int sum=1;
        for(int i=0;i<word.length;i++){
            index=(word[i]-'a')+1;
            revindex=27-index;
            sum+=((i+1)*revindex);
        }

        return sum-1;
        
    }
}