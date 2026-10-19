// class Solution
//  {
//     public List<Integer> targetIndices(int[] nums, int target) 
//     {
        
//         // because of the inn built functions tc=nlogn and it is brute force
//         Arrays.sort(nums);
//         List<Integer> temp = new ArrayList<>();//to store the indices dynamically and matches the return type
//         for(int i=0;i<=nums.length-1;i++)
//         {
//           if(nums[i]==target)
//           {
//             temp.add(i);// adding the required index in the list
//           }
//         }
//         return temp ;
//     }
// }
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countSmaller = 0;
        int countTarget = 0;
        
        // 1. Count elements smaller than target and elements equal to target
        for (int num : nums) {
            if (num < target) {
                countSmaller++;
            } else if (num == target) {
                countTarget++;
            }
        }
        
        // 2. Generate target indices starting from countSmaller
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < countTarget; i++) {
            result.add(countSmaller + i);
        }
        
        return result;
    }
}
