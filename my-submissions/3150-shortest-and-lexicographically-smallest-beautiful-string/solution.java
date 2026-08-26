class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l =0;
        int ones = 0;
        String ans = "";

        for(int r = 0; r< s.length();r++){
            if(s.charAt(r) == '1') ones++;

            while(ones > k){
                if(s.charAt(l) == '1') ones--;
                l++;
            }
            
            while(ones == k && s.charAt(l) == '0'){
                l++;
            }
            
            if(ones == k){
                String cand = s.substring(l,r+1);
                if(ans.isEmpty() || ans.length() > cand.length() || ans.length() == cand.length() && cand.compareTo(ans) < 0){
                    ans = cand;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
