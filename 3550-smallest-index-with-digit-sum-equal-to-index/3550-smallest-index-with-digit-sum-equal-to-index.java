class Solution {
    
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int com;
            com=(nums[i]<9)?nums[i]:sumofdigit(nums[i]);
            if(com==i) return i;
        }
        return -1;
        
    }
    public int sumofdigit(int a){
        int x=0;
        while(a >0){
            x+=a%10;
            a/=10;
        }

        return x;

    }
}