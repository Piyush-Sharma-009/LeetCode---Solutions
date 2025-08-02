class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char s1[] = s.toCharArray();
        for(int i = 0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        int result  = 0;
        boolean odd = false;
       for(int i : map.values()){
        if(i%2 == 0){
            result+=i;
        }
        else {
            result+=i-1;
            odd=true;
        }
       }
       if(odd)
       result += 1;

       return result;
    }
}
