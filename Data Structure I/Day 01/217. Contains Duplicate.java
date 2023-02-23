//Using Hashtable
import java.util.Hashtable;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Boolean> ht = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(ht.get(nums[i]) != null)
                return true;
            ht.put(nums[i],true);
        }
        return false;
    }
}
