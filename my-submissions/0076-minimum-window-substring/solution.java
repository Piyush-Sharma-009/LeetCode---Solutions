class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        int l = 0, r = 0, minLen = Integer.MAX_VALUE,sIdx = -1,cnt = 0;
        for(int i = 0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }

        while(r<s.length()){
            if(hash[s.charAt(r)] > 0) cnt = cnt + 1;
            hash[s.charAt(r)]--;
        
            while(cnt == t.length()){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    sIdx = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) cnt = cnt - 1;
                
                l++;
            }
            r = r + 1;
        }

    return sIdx == -1 ? "" : s.substring(sIdx, sIdx + minLen);

    }
}
