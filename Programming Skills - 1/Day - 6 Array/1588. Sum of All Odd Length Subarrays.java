class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int size = 1; size <= arr.length; size+=2){
            for(int iterate = 0; iterate < arr.length - size + 1; iterate++){
                for(int len = 0; len < size; len++){
                    sum += arr[iterate + len];
                }
            }
        }
        
        return sum;
    }
}
