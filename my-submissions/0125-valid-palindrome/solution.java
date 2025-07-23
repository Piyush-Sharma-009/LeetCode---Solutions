class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                str.append((char)(s.charAt(i)+32));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                str.append(s.charAt(i));
            }
            else if(s.charAt(i)>='0'&&s.charAt(i) <='9')
            str.append(s.charAt(i));
        }
        String org = str.toString();
        String rev = str.reverse().toString();

        return org.equals(rev);

    }
}
