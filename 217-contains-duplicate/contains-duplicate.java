// import java.util.Arrays;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for (int i = 0; i < nums.length - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 return true;
//             }
//         }
        
//         return false;
//     }
// }

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            // .add() returns false if the element is already present in the set
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        
        return false; // All elements are distinct
    }
}