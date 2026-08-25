class Solution {

    public static boolean isFreqEquals(int[] windFreq, int[] hash){
        for(int i = 0;i<26;i++){
            if(windFreq[i] != hash[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] hash = new int[26];
        int[] windFreq = new int[26];

        for(int i = 0;i< s1.length();i++){
            hash[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        for(int right = 0;right < s2.length();right++){
            windFreq[s2.charAt(right) - 'a']++;

            if(right - left + 1 > s1.length()){
                windFreq[s2.charAt(left) - 'a']--;
                left++;
            }

            if(right - left + 1 == s1.length()){
                boolean update = isFreqEquals(windFreq,hash);
                if(update == true) return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
