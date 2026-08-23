class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        char[] str = s.toCharArray();
        int l = 0, r = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        while(r < str.length){
            if(hash[str[r]] != -1){
                if(hash[str[r]] >= l){
                    l = hash[str[r]] + 1;
                }
            }
            int Len = r-l+1;
            maxLen = Math.max(maxLen,Len);
            hash[str[r]] = r;
            r++;
        }
        return maxLen;
    }
}
