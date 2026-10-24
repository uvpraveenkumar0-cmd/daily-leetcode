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

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        for (int i = 0; i <= 30; i++) {
            if (Math.pow(3, i) == n) {
                return true;
            }
        }
        return false;
    }
}