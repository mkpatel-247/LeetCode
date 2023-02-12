class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length;
        int cnt = right;
        while(left < right){
            int mid = left+(right-left)/2;
            int miss = arr[mid]-mid-1;
            if(miss >= k){
                cnt = mid;
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return cnt+k;
    }
}
