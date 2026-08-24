class Solution {
    public int smallestAbsent(int[] nums) {
        double avg=0;
        int sum=0;
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
            sum+=x;
        }

        int n=nums.length;
        avg=((double)sum/n);
        int x=(int)Math.max(1,Math.floor(avg)+1);

        
        while(set.contains(x))
            {
                x++;
            }
            return x;
        
        
        
    }

}