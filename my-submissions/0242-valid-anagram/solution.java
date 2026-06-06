class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();


        for(char ch : s1){
            hm.put(ch,hm.getOrDefault(ch,0) + 1);
            
        }
       
       for(char ch : t1){
        if(hm.containsKey(ch)){
            if(hm.get(ch) <1){
                return false;
            }
            else{
                hm.put(ch,hm.get(ch) - 1);
            }
        }
        else{
            return false;
        }
       }

       return true;

    }
}
