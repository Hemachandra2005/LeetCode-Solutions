class Solution {
    public int numberOfSpecialChars(String word) {
        int x=0;
        HashSet<Character> set= new HashSet<>();
        for(char c: word.toCharArray()){
            set.add(c);
        }
        for(char a: set){
            if(Character.isLowerCase(a) && set.contains(Character.toUpperCase(a))){
                x++;

            }
        }
        return x;
    }
}