class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : nums){
            min = Math.min(min,i); 
            max = Math.max(max,i); 
            mpp.put(i,mpp.getOrDefault(i,0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        while(min <= max){
            if(!mpp.containsKey(min)){
                res.add(min);
            }
            min++;
        }
        return res;

        
    }
}
