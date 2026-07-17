class Solution {

    static int getNthGcdPair(long query, long[] prefixCountGcdPair) {
        int low = 1;
        int high = prefixCountGcdPair.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (prefixCountGcdPair[mid] <= query) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int[] gcdValues(int[] nums, long[] queries) {
        int maxNum = 0;
        for(int i : nums){
            maxNum = Math.max(maxNum,i);
        }

        int[] countDivisor = new int[maxNum + 1];
        for(int i : nums){
            countDivisor[i]++;
        }

        for (int i = 1; i <= maxNum; i++) {
            for (int j = 2 * i; j <= maxNum; j += i) {
                countDivisor[i] += countDivisor[j];
            }
        }

        long[] countGcdPair = new long[maxNum + 1];

        for (int gcd = maxNum; gcd >= 1; gcd--) {
            long totalPairsDivisibleByGcd = (long) countDivisor[gcd] * (countDivisor[gcd] - 1) / 2;
            countGcdPair[gcd] = totalPairsDivisibleByGcd;
            
            // Subtract pairs that actually have a strictly larger GCD (multiples of gcd)
            for (int largerGcd = 2 * gcd; largerGcd <= maxNum; largerGcd += gcd) {
                countGcdPair[gcd] -= countGcdPair[largerGcd];
            }
        }

        long[] prefixCountGcdPair = new long[maxNum + 1];
        for (int gcd = 1; gcd <= maxNum; ++gcd) {
            prefixCountGcdPair[gcd] = prefixCountGcdPair[gcd - 1] + countGcdPair[gcd];
        }

        // step 4: Answer each query using binary search
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = getNthGcdPair(queries[i], prefixCountGcdPair);
        }

        return ans;
    }
}
