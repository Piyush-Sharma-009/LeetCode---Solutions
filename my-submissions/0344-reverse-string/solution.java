class Solution {
    public void reverseString(char[] s) {
        if(s.length == 0 || s.length == 1){
            return ;
        }
        int i = 0;
        int n = s.length - 1;
        while(i<n){
            char temp = s[i];
            s[i] = s[n];
            s[n] = temp;
            i++;
            n--;
        }
        return;
    }
}
