class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
         
         int left=i+1;
         int right=n-1;
         while(left<right){
            int sum=0;
            sum+=nums[i]+nums[left]+nums[right];
            if(sum==0){
                List<Integer> ann=new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right]));
                ans.add(ann);
                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }else if(sum>0){
                right--;
            }
    
         }
        }
        return new ArrayList<>(ans);
        
        
    }
}