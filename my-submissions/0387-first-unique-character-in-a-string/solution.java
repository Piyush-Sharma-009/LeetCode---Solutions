class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] freq= new int[256];
        for(int i = 0;i<chars.length;i++){
            freq[chars[i]]++;
        }
        for(int i = 0;i<chars.length;i++){
            if(freq[chars[i]] == 1)
            return i ;
        }
        return -1;
    }
}
