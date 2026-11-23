// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] answer = new int[n];

//         for (int i = 0; i < n; i++) {
//             int prod = 1;
//             for (int j = 0; j < n; j++) {
//                 if (i != j) {
//                     prod *= nums[j];
//                 }
//             }
//             answer[i] = prod;
//         }

//         return answer;
//     }
// }


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Pass 1: store product of all elements to the left of i
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        // Pass 2: multiply by product of all elements to the right of i
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}
