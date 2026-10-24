// class Solution {
//     public boolean isPowerOfThree(int n) 
//     {
//         if(n<=0) 
//         {
//             return false;
//         }
//         while(n%3==0)
//         {
//             n/=3;
//         }
//         return n==1;
//     }
// }

// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if (n <= 0) return false;

//         for (int i = 0; i <= 30; i++) {
//             if (Math.pow(3, i) == n) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19, the largest power of 3 in a 32-bit signed int
        return n > 0 && 1162261467 % n == 0;
    }
}