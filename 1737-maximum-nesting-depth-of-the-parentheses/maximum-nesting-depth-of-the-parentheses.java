class Solution {
    public int maxDepth(String s) {
        char [] arr=s.toCharArray();
        int n=arr.length;
        Deque <Character> stack =new ArrayDeque<>();
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++){
            char a=arr[i];
            if(a=='('){
                stack.push(a);
                count++;

                
            }else if(a==')'){
                stack.pop();
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
        
    }
}