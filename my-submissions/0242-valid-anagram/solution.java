class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        char s1[] = s.toCharArray();
        for(int i= 0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        char[] t1 = t.toCharArray();
        for(int i = 0;i<t1.length;i++){
            if(!map.containsKey(t1[i]) || map.get(t1[i])  == 0) {
            return false;
            }
        map.put(t1[i],map.get(t1[i]) -1);
        }
        return true;
    }
}
