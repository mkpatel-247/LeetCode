//Using two binary search algorithms.
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans[0] = mid;
                high = mid-1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }

        low = 0;
        high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans[1] = mid;
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }
}

//Second Solution using bitwise operator
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = firstGreaterEqual(nums, target);
		if (start == nums.length || nums[start] != target) {
			return new int[]{-1, -1};
		}
		return new int[]{start, firstGreaterEqual(nums, target + 1) - 1};
	}

	private static int firstGreaterEqual(int[] A, int target) {
		int low = 0, high = A.length;
		while (low < high) {
			int mid = low + ((high - low) >> 1);

			if (A[mid] < target) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}
}
