class Solution {
    public int countOdds(int low, int high) {
        int check = high - low + 1; //Even n Odd in this range will be same
        int count = 0;
        if(low%2 != 0 && high%2 != 0){
            count = (check/2) + 1;
        }
        else{
            count = check/2;
        }  
        return count;
    }
}
