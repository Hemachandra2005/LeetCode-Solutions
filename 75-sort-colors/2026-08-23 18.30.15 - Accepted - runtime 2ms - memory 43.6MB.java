class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        int n=nums.length;

        
        for(int i=0;i<n;i++){
            if(nums[i]==0) zero++;
            if(nums[i]==1) one++;
            if(nums[i]==2) two++;
        }
        int[] ans=new int[n];
        int x=0;
        for(int i=0;i<zero;i++){
            nums[x++]=0;
        }
        for(int i=0;i<one;i++){
            nums[x++]=1;
        }
        for(int i=0;i<two;i++){
            nums[x++]=2;
        }

        System.out.print(Arrays.toString(nums));

        
    }
}