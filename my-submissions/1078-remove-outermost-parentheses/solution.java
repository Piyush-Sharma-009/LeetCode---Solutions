class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        for(char i : s.toCharArray()){
            if(i == '('){
                if(cnt > 0){
                    res.append(i);
                    }cnt++;
            }
            else if(i == ')'){
                cnt--;
                if(cnt >0) res.append(i);
            }
        }
        return res.toString();
    }
}
