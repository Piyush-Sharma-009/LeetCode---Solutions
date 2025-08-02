class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        char mag[] = magazine.toCharArray();
        for(int i = 0;i<mag.length;i++){
            map.put(mag[i],map.getOrDefault(mag[i],0)+1);
        }
        char ran[] = ransomNote.toCharArray();
        for(int i = 0;i<ran.length;i++){
            if(!map.containsKey(ran[i]) || map.get(ran[i]) == 0){
            return false;
            }
            map.put(ran[i],map.get(ran[i]) -1);
        }
        return true;
    }
}
