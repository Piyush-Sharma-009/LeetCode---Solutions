class Solution {
    public int longestConsecutive(int[] nums) {
        int longg = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int i : set){
            if(!set.contains(i - 1)){
                int curr = i;
                int curr_st = 0 ;
                while(set.contains(curr)){
                    curr_st++;
                    curr++;
                }
                longg = Math.max(longg,curr_st);
            }
        }
        return longg;
    }
}
