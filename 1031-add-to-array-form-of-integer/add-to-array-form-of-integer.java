// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k)
//      {
//         ArrayList<Integer> result = new ArrayList<>();
//         int n=0;
//         for(int digit:num)
//         {
//             n=n*10+digit;
//         }
//         n+=k;
//        String s = String.valueOf(n);
//        for(int i=0;i<s.length();i++)
//        {
//         result.add(s.charAt(i) - '0');
//        }
//        return result;

//     }
// }
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        // Loop backwards through the array while there are digits left or k > 0
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.add(k % 10); // Extract the last digit
            k /= 10;            // Carry over the rest
        }

        // Reverse the list since digits were added from right to left
        Collections.reverse(result);
        return result;
    }
}