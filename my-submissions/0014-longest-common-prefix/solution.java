class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        int i =0, j = 0;
        StringBuilder res = new StringBuilder();
        while(i < first.length && j < last.length){
            if(first[i] != last[j]){
                break;
            }
            else{
                res.append(first[i]);
            }
            i++;
            j++;
        }
        return res.toString();
    }
}
