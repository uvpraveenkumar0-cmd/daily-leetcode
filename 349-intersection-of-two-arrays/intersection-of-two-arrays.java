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
        // Step 1: Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0;
        int n1 = nums1.length, n2 = nums2.length;
        
        // Use a temporary array to store results without duplicates
        int[] temp = new int[Math.min(n1, n2)];
        int index = 0;
        
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Found a match; insert only if it's not a duplicate
                if (index == 0 || temp[index - 1] != nums1[i]) {
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        
        // Return exact trimmed copy of the result
        return Arrays.copyOf(temp, index);
    }
}