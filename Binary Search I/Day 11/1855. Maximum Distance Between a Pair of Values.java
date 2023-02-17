class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res = 0;
        for(int i = nums2.length-1; i >= 0; i--) {
            int start = 0, end = Math.min(nums1.length-1, i-1);
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(nums1[mid] <= nums2[i]) {
                    res = Math.max(res, i - mid);
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return res;
    }
}
