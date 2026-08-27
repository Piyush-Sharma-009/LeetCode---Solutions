class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE, resultSum = 0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            int j = i+ 1;
            int k = nums.length -1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) return sum;
                if(sum < target) j++;
                else if(sum > target) k--;
                int diff = Math.abs(sum - target);
                if(diff < minDiff){
                    minDiff = diff;
                    resultSum = sum;
                }
            }
        }
        return resultSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
