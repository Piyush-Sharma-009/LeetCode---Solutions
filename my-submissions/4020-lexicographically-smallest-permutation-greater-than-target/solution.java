class Solution {
    public String lexGreaterPermutation(String s, String target) {

        char[] a = s.toCharArray();
        char[] t = target.toCharArray();

        Arrays.sort(a);

        // If s and target have different lengths
        if (a.length != t.length) return "";

        // We need the smallest permutation of s > target.
        //
        // Start with the smallest permutation of s.
        // Find the first position from the right where
        // we can make the permutation larger.

        int n = a.length;

        for (int i = n - 1; i >= 0; i--) {

            // Build the prefix equal to target[0..i-1]
            TreeMap<Character, Integer> freq = new TreeMap<>();

            for (char c : a) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            boolean possible = true;

            for (int j = 0; j < i; j++) {
                if (!freq.containsKey(t[j])) {
                    possible = false;
                    break;
                }

                remove(freq, t[j]);
            }

            if (!possible) continue;

            // At position i, choose the smallest character > target[i]
            Character next = freq.higherKey(t[i]);

            if (next != null) {

                StringBuilder ans = new StringBuilder();

                // Prefix equal to target
                for (int j = 0; j < i; j++) {
                    ans.append(t[j]);
                }

                // Make it just larger
                ans.append(next);
                remove(freq, next);

                // Fill remaining characters in sorted order
                for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                    for (int j = 0; j < entry.getValue(); j++) {
                        ans.append(entry.getKey());
                    }
                }

                return ans.toString();
            }
        }

        return "";
    }

    private static void remove(TreeMap<Character, Integer> map, char c) {
        int count = map.get(c);

        if (count == 1)
            map.remove(c);
        else
            map.put(c, count - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
