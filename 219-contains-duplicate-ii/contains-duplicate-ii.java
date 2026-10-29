// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
        
//     }
// }

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k)
     {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
         {
          
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            // If the element is already in the set, a duplicate within k distance exists
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}