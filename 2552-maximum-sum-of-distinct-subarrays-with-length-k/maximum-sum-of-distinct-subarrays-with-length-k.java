import java.util.HashMap;
import java.util.Map;

class Solution
{
    public long maximumSubarraySum(int[] nums, int k) 
    {
        long maxSum = 0;
        long currentSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Process the first window of size k
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxSum = currentSum;
        }

        // 2. Slide the window across the rest of the array
        for (int i = k; i < nums.length; i++) {
            // Add incoming element
            int in = nums[i];
            currentSum += in;
            map.put(in, map.getOrDefault(in, 0) + 1);

            // Remove outgoing element
            int out = nums[i - k];
            currentSum -= out;
            int count = map.get(out);
            if (count == 1) {
                map.remove(out);
            } else {
                map.put(out, count - 1);
            }

            // Check if current window has all distinct elements
            if (map.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}