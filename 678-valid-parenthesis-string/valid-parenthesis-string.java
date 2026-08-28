class Solution {
    public boolean checkValidString(String s) {
        int high=0;
        int low=0;
       
        for(char a:s.toCharArray()){
            if(a=='('){
                high++;
                low++;

            }
            else if(a==')'){
                high--;
                low--;
            }
            else if(a=='*'){
                high++;
                low--;
            }
            if(high<0) return false;
            if(low <0) low=0;


        }
        
        return low==0;


        
        
    }
}