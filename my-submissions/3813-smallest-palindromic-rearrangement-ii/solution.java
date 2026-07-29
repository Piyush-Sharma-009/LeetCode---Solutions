class Solution {
    private static final long MAX = 1_000_000_001L;

    public String smallestPalindrome(String s, long k) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int[] halfCount = new int[26];
        String midLetter = "";
        for (int i = 0; i < 26; i++) {
            halfCount[i] = count[i] / 2;
            if (count[i] % 2 == 1) {
                midLetter = String.valueOf((char) (i + 'a'));
            }
        }

        long totalPerm = countArrangements(halfCount);
        if (k > totalPerm) {
            return "";
        }

        StringBuilder leftHalf = new StringBuilder();
        int halfLen = 0;
        for (int c : halfCount) halfLen += c;

        for (int step = 0; step < halfLen; step++) {
            for (int i = 0; i < 26; i++) {
                if (halfCount[i] == 0) continue;
                
                halfCount[i]--;
                long arrangements = countArrangements(halfCount);
                
                if (arrangements >= k) {
                    leftHalf.append((char) (i + 'a'));
                    break;
                } else {
                    k -= arrangements;
                    halfCount[i]++;
                }
            }
        }

        StringBuilder res = new StringBuilder(leftHalf);
        res.append(midLetter);
        res.append(new StringBuilder(leftHalf).reverse());

        return res.toString();
    }

    private long countArrangements(int[] count) {
        int total = 0;
        for (int c : count) total += c;

        long res = 1;
        for (int freq : count) {
            if (freq == 0) continue;
            res = multiplySafely(res, nCk(total, freq));
            total -= freq;
            if (res >= MAX) return MAX;
        }
        return res;
    }

    private long nCk(int n, int k) {
        long res = 1;
        k = Math.min(k, n - k);
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
            if (res >= MAX) return MAX;
        }
        return res;
    }

    private long multiplySafely(long a, long b) {
        if (a >= MAX / b) return MAX;
        return a * b;
    }
}
