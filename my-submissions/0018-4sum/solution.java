class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        int n  = nums.length;
        for(int i =0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum =(long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        li.add(nums[l]);
                        Collections.sort(li);
                        st.add(li);
                        k++;
                        l--;
                    }
                    else if(sum < target) k++;
                    else l--;
                }
            }
        }   
        res.addAll(st);
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
