class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        char[] chars = s.toCharArray();

        if(chars.length == 1 && (chars[0] == ')' || chars[0] == '}' || chars[0] == ']')) return false;

        for(char ch : chars ){
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty()) return false;

                if(ch == ')' && st.pop() != '('  ){
                    return false;
                }
                else if(ch == '}' && st.pop() != '{'  ){
                    return false;
                }
                else if(ch == ']' && st.pop() != '['  ){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
