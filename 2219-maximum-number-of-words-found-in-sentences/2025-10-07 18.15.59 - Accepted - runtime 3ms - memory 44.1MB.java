class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxwords=0;
        for(String sentence:sentences){
            int count=0;
            String[] words=sentence.split(" ");
            count=words.length;
            maxwords=Math.max(count,maxwords);
        }
        return maxwords;
        
    }
}