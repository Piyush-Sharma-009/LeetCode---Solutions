class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;

        int[] freqS = new int[256];     //covers all ASCIIs
        int[] freqT = new int[256];
        
        for(int i = 0;i<s.length();i++){

            freqS[s.charAt(i)]++;
             freqT[t.charAt(i)]++;
        }

        for(int i = 0;i<freqS.length;i++){
            if(freqS[i]!=freqT[i])
            return false;
        }



        return true;
    }
}
