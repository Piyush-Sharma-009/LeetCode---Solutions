class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int maxEl = 0;
        
        for (int num : nums) {
            maxEl = Math.max(maxEl, num);
        }
        
        // Find the next power of 2 to bound the maximum possible XOR value space
        int T = 1;
        while (T <= maxEl) {
            T <<= 1;
        }
        
        boolean[] s1 = new boolean[T];
        boolean[] s2 = new boolean[T];
        
        // Step 1: Generate all unique pair XORs (j <= k)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                s1[nums[i] ^ nums[j]] = true;
            }
        }
        
        // Step 2: Combine every valid pair XOR with each element in nums
        for (int i = 0; i < T; i++) {
            if (s1[i]) {
                for (int num : nums) {
                    s2[i ^ num] = true;
                }
            }
        }
        
        // Step 3: Count total unique triplet XOR values
        int count = 0;
        for (int i = 0; i < T; i++) {
            if (s2[i]) {
                count++;
            }
        }
        
        return count;
    }
}
