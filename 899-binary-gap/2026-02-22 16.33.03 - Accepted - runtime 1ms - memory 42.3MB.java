class Solution {
    public int binaryGap(int n) {
       String bin=Integer.toBinaryString(n);
       int l=bin.length();
       int max=0;
       ArrayList<Integer> ind=new ArrayList<>();

       for(int i=0;i<l;i++){
         if(bin.charAt(i)=='1'){
            ind.add(i);
         }
       }

       for(int i=1;i<ind.size();i++){
        max=Math.max(max,ind.get(i)-ind.get(i-1));

       }
        return max;
    }
}