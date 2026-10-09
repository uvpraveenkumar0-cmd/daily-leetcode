// class Solution
// {
//     public boolean isPowerOfTwo(int n) 
//     {
//         double result =0;
//         for(int i=0;i<=n;i++)
//         {
//             double result = Math.pow(2, i);
//             if(result == n)
//             {
//                 return true;
//             }
//         }
//         return false;
        
//     }
// }
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        for (int i = 0; i <= 30; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }
        }
        return false;
    }
}