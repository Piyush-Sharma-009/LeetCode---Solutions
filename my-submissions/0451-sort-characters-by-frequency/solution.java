class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        char [] res = new char[256];
        for(int i = 0;i<256;i++){
            res[i] = (char)i;
        }

        for(int i = 0;i<256;i++){
            for(int j = i+1;j<256;j++){
                if(freq[res[j]]>freq[res[i]]){
                    char temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<256;i++){
            int count = freq[res[i]];
            while(count-- > 0){
                str.append(res[i]);
            }
        }
        return str.toString();
    }
}
