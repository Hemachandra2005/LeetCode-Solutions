class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,max=0;
        int n=nums.length;

        for(int r=0;r<n;r++){
            if(nums[r]==0){
                l=r+1;
            }
            int len=(r-l)+1;
            max=Math.max(max,len);
        }
        return max;
        
    }
}