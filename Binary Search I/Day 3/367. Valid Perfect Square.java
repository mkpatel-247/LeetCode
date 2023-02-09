class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
          return true;
        long start = 2;
        long end = num/2;
        while(start <= end){
            long mid = start+(end-start)/2;
            long perfectSquare = mid*mid;
            if(perfectSquare == num)
                return true;
            else if(perfectSquare < num)
                start = mid+1;
            else
                end = mid - 1;
        }
        return false;
    }
}
