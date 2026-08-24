class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
       int sum=nums[0];
       for(int j=1;j<n;j++){
        if(nums[j]==nums[j-1]+1){
            sum+=nums[j];
        }else{
            break;
        }
       }
       
       Arrays.sort(nums);
       for(int i=0;i<n;i++){
        if(sum==nums[i]){
            sum++;
        }
       }
        return sum;
    }
}