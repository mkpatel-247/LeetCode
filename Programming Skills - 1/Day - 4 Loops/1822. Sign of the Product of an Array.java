class Solution {
    public int arraySign(int[] nums) {
        int mul = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                return 0;
            else if(nums[i] < 0)
                mul++;
        }
        return mul%2 == 0 ? 1 : -1;
    }
}
