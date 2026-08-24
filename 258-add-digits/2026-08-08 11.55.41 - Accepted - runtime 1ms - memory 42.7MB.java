class Solution {
    public int addDigits(int num) {
        int ans=num;
        while(true){
            if(ans >=0 && ans<=9){
                return ans;
            }else{
                int temp=ans;
                int add=0;
                while(temp>0){
                    int x=temp%10;
                    temp /=10;
                    add+=x;
                }
                ans=add; 
            }

        }
        
        
    }
}