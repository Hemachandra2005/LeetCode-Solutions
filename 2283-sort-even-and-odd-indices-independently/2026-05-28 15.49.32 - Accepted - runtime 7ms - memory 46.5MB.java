class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2 !=0){
                odd.add(nums[i]);
            }else{
                even.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());

        int a=0;
        int b=0;

        ArrayList<Integer> ans= new ArrayList<>();

        for(int j=0;j<nums.length;j++){
            if(j%2 != 0){
                ans.add(odd.get(a++));
            }else{
                ans.add(even.get(b++));
            }
        }
        int [] res=new int[n];
        for(int x=0;x<n;x++){
            res[x]=ans.get(x);
        }

        return res;

        
    }
}