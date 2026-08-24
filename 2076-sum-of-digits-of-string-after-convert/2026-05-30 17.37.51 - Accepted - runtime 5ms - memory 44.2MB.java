class Solution {
    public int getLucky(String s, int k) {
        String num="";
        for(char a: s.toCharArray()){
            num+= a-'a'+1;
        }
        
        for(int i=0;i<k;i++){
            int a=0;
            for(char c: num.toCharArray()){
                a += c-'0';
            }
            num=String.valueOf(a);
        }
        return Integer.parseInt(num);


        
    }
}