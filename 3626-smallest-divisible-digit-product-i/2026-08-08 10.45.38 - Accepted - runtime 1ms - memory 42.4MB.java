class Solution {
    public int fact(int n){

        int pro=1;
        while(n>0){
            int x=n%10;
            n/=10;
            pro*=x;

        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            int x=fact(n);
            if(x%t==0){
                return n;
            }else{
                n++;
            }

        }

        
        

        
        
    }
}