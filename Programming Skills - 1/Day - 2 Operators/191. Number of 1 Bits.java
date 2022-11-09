public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        String nums = Integer.toBinaryString(n);
        for(int i = 0; i < nums.length(); i++){
            if(nums.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
