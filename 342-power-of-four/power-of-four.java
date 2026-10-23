class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
       // repeeatdly divding by 4
        while (n % 4 == 0)
        {
            n /= 4;
        }
        
        return n == 1;
    }
}