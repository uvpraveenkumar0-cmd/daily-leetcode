class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < n; j++) {
                // Skip checking the character against itself
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If no match was found throughout the string, return its index
            if (!isDuplicate) {
                return i;
            }
        }
        
        return -1;
    }
}