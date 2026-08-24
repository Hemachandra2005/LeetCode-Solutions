class Solution {
    public int maxProduct(int n) {
        
        int a=0;
        int first=0;
        int second =0;
        while(n>0){
            a=n%10;
            n/=10;

            if(a>first){
                second=first;
                first=a;
            }else if(a>second){
                second=a;
            } 
        }
    
    return first*second;
    }
}