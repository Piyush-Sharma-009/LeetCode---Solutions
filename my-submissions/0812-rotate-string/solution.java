class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        return false;
        if(s.equals(goal))
        return true;
        char[] chars = s.toCharArray();
        int TotalRotate = s.length()-1;
        for(int i = 0;i<=TotalRotate;i++){
            char var = chars[0];
            for(int j = 1;j<s.length();j++){
                chars[j-1] = chars[j];
            }
            chars[s.length()-1] = var;
            if(new String(chars).equals(goal))
                return true;
        }
        return false;
    }
}
