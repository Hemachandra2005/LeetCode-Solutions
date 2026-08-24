class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        if(m <n) return false;
        for(int i=0;i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            if(anagram(s1,sub)) return true;
        }
        return false;
        
    }
    public static boolean anagram(String s1,String sub){
        int[] alpa=new int[26];
        int n=s1.length();
        s1=s1.toLowerCase();
        sub=sub.toLowerCase();
        for(int i=0;i<n;i++){
            alpa[s1.charAt(i)-'a']++;
            alpa[sub.charAt(i)-'a']--;
        }
        for(int x:alpa){
            if(x !=0){
                return false;
            }
        }
        return true;

    }
}