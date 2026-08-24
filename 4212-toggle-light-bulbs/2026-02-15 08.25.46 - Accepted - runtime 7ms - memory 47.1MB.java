

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int n=bulbs.size();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.contains(bulbs.get(i))){
                ans.remove(bulbs.get(i));
            }else{
                ans.add(bulbs.get(i));
            }
        }
        Collections.sort(ans);

        return ans;
        
    }
}