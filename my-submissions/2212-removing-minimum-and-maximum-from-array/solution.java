class Solution {
    public int minimumDeletions(int[] nums) {
    int n = nums.length;
    int mid = n/2;
    int minE = Integer.MAX_VALUE, maxE = Integer.MIN_VALUE;
    int minIdx = 0;
    if(n == 1) return 1;
    int maxIdx = 0;
    int totalSum = 0;
    for(int i = 0;i<n;i++){
        if(minE > nums[i]){
            minE = nums[i];
            minIdx = i;
        }

        if(maxE < nums[i]){
            maxE = nums[i];
            maxIdx = i;
        }
    }
    if (minIdx > maxIdx) {
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }

        // 1. Both from left
        int left = maxIdx + 1;

        // 2. Both from right
        int right = n - minIdx;

        // 3. One from left, one from right
        int both = (minIdx + 1) + (n - maxIdx);

        return Math.min(left, Math.min(right, both));
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
