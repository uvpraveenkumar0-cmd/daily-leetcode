// import java.util.Arrays;

// class Solution {
//     public int maximumProduct(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
        
//         int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
//         int p2 = nums[0] * nums[1] * nums[n - 1];
        
//         return Math.max(p1, p2);
//     }
// }
// optiml one
class Solution {
    public int maximumProduct(int[] nums) {
        // Track the top 3 maximums
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        // Track the top 2 minimums
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            // Update 3 largest values
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
             else if (n > max2)
              {
                max3 = max2;
                max2 = n;
            } else if (n > max3) 
            {
                max3 = n;
            }

            // Update 2 smallest values
            if (n < min1) 
            {
                min2 = min1;
                min1 = n;
            }
             else if (n < min2)
              {
                min2 = n;
            }
        }

        // Option 1: Product of 3 largest
        int option1 = max1 * max2 * max3;
        // Option 2: Product of 2 smallest (negative) and largest
        int option2 = min1 * min2 * max1;

        return Math.max(option1, option2);
    }
}
