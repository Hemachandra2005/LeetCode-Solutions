

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> a=new ArrayList<>();
        int n=nums.length;
        for(String num:nums){
            a.add(num);
        }
        int p =(int)Math.pow(2,n);
        for(int i=0;i<p;i++){
            String b=Integer.toBinaryString(i);
            while(b.length()<n){
                b='0'+b;
            }

            if(!a.contains(b)){
                return b;
            }

        }
        return "";
        
    }
}