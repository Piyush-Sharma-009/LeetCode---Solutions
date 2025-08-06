class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch  = s.charAt(i);
             if(Character.isLetterOrDigit(ch))
            {
                if(ch >= 'A' && ch <= 'Z'){
                    ch = (char)(ch + 32);
                }
            str.append(ch);
            }
            else 
            continue;
        }
        char chars[] = str.toString().toCharArray();
        int left = 0;
        int right = chars.length -1;
        while(left < right){
            if(chars[left] == chars[right]){
                left ++;
                right --;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
