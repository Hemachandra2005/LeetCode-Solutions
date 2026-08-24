class Solution {
    public int bitwiseComplement(int n) {

        String bin=Integer.toBinaryString(n);
        StringBuilder flp=new StringBuilder();
        for(char c:bin.toCharArray()){
            if(c=='1'){
                flp.append('0');

            }else{
                flp.append('1');
            }
        }

        int ans=Integer.parseInt(flp.toString(),2);
        return ans;

        
    }
}