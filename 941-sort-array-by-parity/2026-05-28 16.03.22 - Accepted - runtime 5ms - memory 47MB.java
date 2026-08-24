class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] odd =new int[n];
        int[] even=new  int[n];
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(nums[i] %2==0){
                even[a++]=nums[i];
            }else{
                odd[b++]=nums[i];
            }
        }
        int result []=IntStream.concat(Arrays.stream(even,0,a),Arrays.stream(odd,0,b)).toArray();

        return result;

        
    }
}