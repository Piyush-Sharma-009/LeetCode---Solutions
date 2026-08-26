class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<nums.length -1;i++){
            
                HashSet<Integer> st = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int third = -(nums[i] + nums[j]);
                if(st.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                st.add(nums[j]);
            }
            
        }
        res.addAll(set);
            return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
