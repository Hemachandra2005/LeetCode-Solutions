class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int smallest =nums[0];
        int largest= nums[n-1];
        List<Integer> ans=new ArrayList<>();
        Set<Integer> com=new HashSet<>();
        for(int i=0;i<=n-1;i++){
            com.add(nums[i]);
        }
        for(int i=smallest;i<largest;i++){
            if(!com.contains(i)){
                ans.add(i);
            }
        }

        return ans;
        
    }
}