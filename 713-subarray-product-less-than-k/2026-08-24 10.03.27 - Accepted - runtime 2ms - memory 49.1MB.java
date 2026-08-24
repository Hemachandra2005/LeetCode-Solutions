class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int l=0;
        int n=nums.length;
        int mul=1;
        int count=0;
        for(int r=0;r<n;r++){
            mul*=nums[r];
            while(mul>=k){
                mul/=nums[l];
                l++;
            }
           count+=(r-l)+1;
        }

        return count;

        
    }
}