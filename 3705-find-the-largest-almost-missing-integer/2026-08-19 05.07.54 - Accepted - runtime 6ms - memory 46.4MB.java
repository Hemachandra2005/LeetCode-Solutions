class Solution {
    public int largestInteger(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;

        for(int i=0;i<=n-k;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            for(int p:set){
                map.put(p,map.getOrDefault(p,0)+1);
            }
        }
    int max=-1;

    for(int x:map.keySet()){
        if(map.get(x)==1){
            max=Math.max(max,x);
        }
    }
    return max;
    }
}