class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,mul=1;
        int x=n;
        while(n>0){
            int a=n%10;
            mul*=a;
            sum+=a;
            n /=10;
        }
        int m=sum+mul;
        if(x%m!=0){
            return false;
        }
        return true;
        
    }
}