class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] index = new int[2];
        if (num == null || num.length < 2) 
            return index;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                index[0] = left + 1;
                index[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return index;
    }
}
