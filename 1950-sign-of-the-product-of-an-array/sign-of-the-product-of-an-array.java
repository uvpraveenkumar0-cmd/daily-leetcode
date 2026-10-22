// class Solution {
//     public int arraySign(int[] nums) 

//     {
//         long product=1;
//       int n= nums.length;
//       for(int i=0;i<=n-1;i++)
//       {
//         product*=nums[i];
        
//       }
//       if(product==0)
//       {
//         return 0;
//       }
//      else if(product>0)
//     {
//       return 1;
//     }
//     return -1;
//     }
// }
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0; 
            }
            if (num < 0) {
                sign = -sign; 
            }
        }

        return sign;
    }
}