class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int maxlen = 0;
        int left = 0;
        int right = 0;
        while(right <s.length()){
            if(!st.contains(s.charAt(right))){
                st.add(s.charAt(right));
                maxlen = Math.max(maxlen,right - left +1);
                right++;
            }
            else{
                st.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}
