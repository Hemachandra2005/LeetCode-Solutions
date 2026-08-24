class Solution {
    public boolean canAliceWin(int n) {
        int remove =10;
        int turn=1;

        while(n >=remove){
            n -=remove;
            turn++;
            remove--;
        }

        return turn%2==0;
        
    }
}