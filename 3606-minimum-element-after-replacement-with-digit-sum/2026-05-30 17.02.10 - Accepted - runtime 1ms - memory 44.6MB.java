class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        
        for(int n: nums){
            int x=0;
            while(n >0){
                x+= n%10;
                n /=10;
            }
            min=Math.min(min,x);
            
        }

        return min;
        
    }
}