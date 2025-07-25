class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if(len != t.length())
        return false;
        int[] indexs = new int[200];
        int[] indext = new int[200];
        for(int i = 0;i<len;i++){
            if(indexs[s.charAt(i)] != indext[t.charAt(i)])
            return false;

        indexs[s.charAt(i)] = i+1;
        indext[t.charAt(i)] = i+1;
        }
        return true;
    }
}
