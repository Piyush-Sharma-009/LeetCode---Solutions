class Solution {
    static void reverse(char[] a,int start, int n){
        int i =start,j = n-1;
        while(i<j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return;
    }
    static void reverseWord(char[] a, int n){
        int i =0,j = 0;
        while(i<n){
            while(i<n && a[i] ==  ' '){
                i++;
            }
            if(i>=n) break;
            j = i;
            while(j<n && a[j] != ' '){
                j++;
            }
            reverse(a,i,j);
            i = j;
        }
        return;
    }
    static String cleanSpaces(char[] a, int n){
        int i =0,j =0;
        while(j<n){
            while(j<n && a[j] == ' '){
                j++;
            }

            while(j <n && a[j] != ' '){
                a[i++] = a[j++];
            }
            while(j<n && a[j] == ' ')j++;
            if(j<n) a[i++] = ' ';
        }
        return new String(a,0,i);
    }
    public String reverseWords(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        reverse(a,0,n);
        reverseWord(a,n);
        return  cleanSpaces(a,n);
    }
}
