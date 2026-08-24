class Solution {
    public boolean check(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>nums[(i+1)%nums.length]){
            a++;
        }
        }
       return a<=1;
    }
}