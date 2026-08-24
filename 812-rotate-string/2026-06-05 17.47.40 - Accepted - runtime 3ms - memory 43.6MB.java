class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            char first=s.charAt(0);
            String rem=s.substring(1);
             s=rem+first;
            if(s.equals(goal)){
                return true;
            }
    
        }
        return false;

        
    }
}