class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt= 0;
        int curr_sum = 0;

        map.put(0,1);

        for(int i : nums){
            curr_sum += i;
            if(map.containsKey(curr_sum - k)){
                cnt += map.get(curr_sum - k);
            }

            map.put(curr_sum,map.getOrDefault(curr_sum, 0) + 1);
        }
        return cnt;
    }
}
