class Solution {
    public int maxDepth(String s) {
        int max_par = 0;
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                cnt++;
                if(max_par <cnt)
                max_par = cnt;
            }
            else if(s.charAt(i) == ')')
            cnt --;
        }
        return max_par;
    }
}
