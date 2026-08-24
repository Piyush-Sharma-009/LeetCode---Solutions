class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int l = 0,r = 0;
        int maxLen = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            if(hash[str[r]] != -1){
                if(hash[str[r]] >= l){
                    l = hash[str[r]] + 1;
                }
            }
            int len = r-l +1;
            maxLen = Math.max(maxLen,len);
            hash[str[r]] = r;
            r++;
        }
        return maxLen;
        
    }
}
