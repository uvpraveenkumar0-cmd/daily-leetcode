class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
     int prev2 = 2; // Ways to reach step 2
        int prev1 = 3; 
        int current = 0;
     for (int i = 4; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}