class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
        
        while(st.add(n)){
            int squareSum = 0;
            while(n > 0){
                squareSum += Math.pow(n%10, 2);
                n = n/10;
            }
            
            if(squareSum == 1)
                return true;
            else
                n = squareSum;
        }
        return false;
    }
}
