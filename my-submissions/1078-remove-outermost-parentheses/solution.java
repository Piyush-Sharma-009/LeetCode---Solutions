class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(count >0)
                    res.append(c); //skips outermost (
                    count++;
                
            }
            else{
                count--;
                if(count>0)
                res.append(c);  //skips outermost )
            }
        }
        return res.toString();
    }
}
