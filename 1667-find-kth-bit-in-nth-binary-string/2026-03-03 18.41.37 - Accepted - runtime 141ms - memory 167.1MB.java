class Invert{
    public ArrayList<Character> invert(ArrayList<Character> list){
        ArrayList<Character> inv=new ArrayList<>();
        for(char c:list){
            if(c=='0'){
                inv.add('1');
            }else{
                inv.add('0');
            }
        }
        return inv;

    }
      
    }
class Reverse{
    public ArrayList<Character> reverse(ArrayList<Character> list){
        ArrayList<Character> rev=new ArrayList<>();
        
        for(int i=list.size()-1;i>=0;i--){
            rev.add(list.get(i));
        }
        return rev;

        
    }


}
class Solution {
    public char findKthBit(int n, int k) {
        
        ArrayList<Character> list=new ArrayList<>();
        list.add('0');
        Invert inv=new Invert();
        Reverse rev=new Reverse();
        for(int i=2;i<=n;i++){
            
           ArrayList<Character> inve=inv.invert(list);
           ArrayList<Character> reve=rev.reverse(inve);
           list.add('1');
           list.addAll(reve);

            
        }
        return list.get(k-1);
    }
}