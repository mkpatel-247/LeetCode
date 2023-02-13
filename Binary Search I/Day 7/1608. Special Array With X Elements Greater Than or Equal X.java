class Solution {
    public int specialArray(int[] nums) {
        int left=0;
        int right=nums.length;
        while(left <= right){
            int mid = left+(right-left)/2;
            int cnt = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=mid) cnt++;
            }
            if(cnt==mid) 
                return mid;
            if(cnt > mid)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return -1;
    }
}
