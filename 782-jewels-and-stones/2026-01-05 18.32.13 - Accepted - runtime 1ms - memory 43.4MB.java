class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(char j: jewels.toCharArray()){
            set.add(j);
        }
        int count=0;
        for(char x:stones.toCharArray()){
            if(set.contains(x)){
                count++;
            }
        }
        return count;
    }
}