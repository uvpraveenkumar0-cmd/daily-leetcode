// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         // Store all unique elements of nums1 in a HashSet
//         Set<Integer> set1 = new HashSet<>();
//         for (int num : nums1) {
//             set1.add(num);
//         }
        
//         // Use another set to store the intersection result to avoid duplicates
//         Set<Integer> intersectionSet = new HashSet<>();
//         for (int num : nums2) {
//             if (set1.contains(num)) {
//                 intersectionSet.add(num);
//             }
//         }
        
//         // Convert the result set into an int array
//         int[] result = new int[intersectionSet.size()];
//         int index = 0;
//         for (int num : intersectionSet) {
//             result[index++] = num;
//         }
        
//         return result;

//     }
// }


import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int left= 0, right = 0;
        int n1 = nums1.length, n2 = nums2.length;
        int[] temp = new int[Math.min(n1, n2)];
        int index = 0;
        
        while (left < n1 && right < n2) {
            if (nums1[left] < nums2[right])
             {
                left++;
            } 
            else if (nums1[left] > nums2[right])
             {
                right++;
            }
             else {
                // Found a match; insert only if it's not a duplicate
                if (index == 0 || temp[index - 1] != nums1[left]) {
                    temp[index] = nums1[left];
                    index++;
                }
                left++;
                right++;
            }
        }
        
        // Return exact trimmed copy of the result
        return Arrays.copyOf(temp, index);
    }
}