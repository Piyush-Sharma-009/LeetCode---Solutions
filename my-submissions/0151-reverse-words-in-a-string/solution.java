
class Solution {
    public String reverseWords(String s) {
        StringBuilder rev = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')i--;
            if(i<0) break;
            int end = i;
            while(i>=0 && s.charAt(i)!= ' ')i--;
            int start = i+1;
            for(int j = start;j<=end;j++){
                rev.append(s.charAt(j));
            }
            rev.append(' ');
        }
        //removing the last space
        if(rev.length()>0) {
        rev.setLength(rev.length()-1);
        }
        return rev.toString();
    }
}

