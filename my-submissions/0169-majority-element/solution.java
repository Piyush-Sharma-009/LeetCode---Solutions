class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int key = 0;
        int maxVal = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(maxVal < entry.getValue()){
                maxVal = entry.getValue();
                key = entry.getKey();

            }
        }
        return key;
    }
}
