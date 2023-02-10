class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        long start = 1;
        long end = x, res = 0;
        while(start <= end){
            long mid = start+(end-start)/2;
            long sqrt = mid * mid;
            
            if(sqrt <= x){
                res = mid;
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return (int)res;
    }
}
