class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     int j = i;
        //     while(j < nums.length){
        //         if(nums[j] != 0){
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //             break;
        //         }
        //         j++;
        //     }
        // }
        
        //Same Approch with Optimization
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
