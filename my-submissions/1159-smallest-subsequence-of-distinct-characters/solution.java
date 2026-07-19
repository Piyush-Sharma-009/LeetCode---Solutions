class Solution {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }

        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            count[ch - 'a']--;

            if(visited[ch -'a']){
                continue;
            }

            while(!st.isEmpty() && st.peek() > ch && count[st.peek() - 'a']>0){
                char removed = st.pop();
                visited[removed - 'a'] = false;
            }

            st.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder res = new StringBuilder();

        for(char ch : st){
            res.append(ch);
        }
        return res.toString();

    }
}
