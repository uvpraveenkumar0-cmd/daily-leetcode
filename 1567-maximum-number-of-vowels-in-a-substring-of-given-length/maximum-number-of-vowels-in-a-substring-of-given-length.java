// class Solution {
//     public int maxVowels(String s, int k) {
//         int currentVowels = 0;
//         for (int i = 0; i < k; i++) {
//             if (isVowel(s.charAt(i))) {
//                 currentVowels++;
//             }
//         }

//         int maxVowels = currentVowels;
//         for (int i = k; i < s.length(); i++)
//          {
    
//             if (maxVowels == k) return k;

//             if (isVowel(s.charAt(i))) 
//             {
//                 currentVowels++;
//             }
//             if (isVowel(s.charAt(i - k)))
//              {
//                 currentVowels--;
//             }

//             maxVowels = Math.max(maxVowels, currentVowels);
//         }

//         return maxVowels;
//     }

//     private boolean isVowel(char c) {
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//     }
// }
class Solution {
    public int maxVowels(String s, int k) {
        if(s==null||s.isEmpty())
        return 0;

        int n = s.length();
        int i = 0 , j =0;
        char[] charArray = s.toCharArray();
        int currentCount =0 , maxCount = Integer.MIN_VALUE;
        while(j<n)
        {
            if(isVowel(charArray[j]))
            currentCount++;

            if(j-i+1<k)
            j++;
            else if(j-i+1==k)
            {
                maxCount = Math.max(maxCount,currentCount);
                if(isVowel(charArray[i]))
                currentCount--;

                i++;
                j++;
            }

        }
        return maxCount;
    }
    private boolean isVowel(char ch)
    {
        if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return true;
        else return false;
    }
}