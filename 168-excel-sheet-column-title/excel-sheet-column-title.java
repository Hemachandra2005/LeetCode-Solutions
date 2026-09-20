class Solution {
    public String convertToTitle(int columNumber) {
        StringBuilder sb=new StringBuilder();
        while(columNumber>0){
            columNumber--;
            int remin=columNumber%26;
            char a=(char) ('A'+remin);
            sb.insert(0,a);
            columNumber/=26;
        }
        return sb.toString();
        
    }
}