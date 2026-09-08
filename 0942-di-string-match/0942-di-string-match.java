class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int [] nums=new int[n+1];
        int [] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            nums[i]=i;
        }
        int r=n,l=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                ans[i]=nums[l];
                l++;
            }else{
                ans[i]=nums[r];
                r--;
            }

        }
        ans[n]=r;
        return ans;
        
    }
}