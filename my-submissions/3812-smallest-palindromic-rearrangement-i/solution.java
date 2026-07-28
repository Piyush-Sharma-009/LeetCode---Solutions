class Solution {
    public String smallestPalindrome(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder firstHalf = new StringBuilder();
        char oddChar = 0;
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                if (count[i] % 2 != 0) {
                    oddChar = (char) (i + 'a');
                }
                for (int j = 0; j < count[i] / 2; j++) {
                    firstHalf.append((char) (i + 'a'));
                }
            }
        }
        
        StringBuilder res = new StringBuilder(firstHalf);
        if (oddChar != 0) {
            res.append(oddChar);
        }
        res.append(firstHalf.reverse());
        
        return res.toString();
    }
}
