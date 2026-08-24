class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
       for(int x:candies){
          if(x>max){
            max=x;
          }
       }
       List<Boolean> res=new ArrayList<>();
       for(int a:candies){
        if((a+extraCandies)>=max){
            res.add(true);
        }else{
            res.add(false);
        }
       }
       return res;
    }
}