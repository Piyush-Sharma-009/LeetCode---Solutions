class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        char[] ch = word.toCharArray();
        for(int i = 0;i<ch.length;i++){
            count[ ch[i] - 'a' ]++;
        }
        Arrays.sort(count);
        
        int pushes = 0;
        int uniqueCount = 0;
        for(int i = 25;i>=0;i--){
            if(count[i] == 0) break;
           int multiplier = uniqueCount/8 + 1;
           pushes += multiplier*count[i];
           uniqueCount++;
        }
        return pushes;
    }
}
