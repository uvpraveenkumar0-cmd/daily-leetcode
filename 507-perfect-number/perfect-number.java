// class Solution {
//     public boolean checkPerfectNumber(int num) {
//         int sum=0;
//         // int n=100;
//         for(int i=1;i<num;i++)
//         {
//             if(num%i==0)
//             {
//                  sum+=i;
                 
//             }
//             // if(sum==num)
//             // {
//             //     return true;
//             // }
         
//         }
//           if(sum==num)
//             {
//                 return true;
//             }
//         return false;
        
//     }

// }


class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1; // 1 is always a proper divisor
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i; // Add the paired divisor
                }
            }
        }
        
        return sum == num;
    }
}