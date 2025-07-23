import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[256];     // Frequency of each character
        boolean[] seen = new boolean[256]; // Tracks if character is in result

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            freq[c]--; // use this character

            if (seen[c]) continue; // already in result

            // pop from stack if:
            // - current char < top of stack
            // - top of stack still occurs later
            while (!stack.isEmpty() && c < stack.peek() && freq[stack.peek()] > 0) {
                char removed = stack.pop();
                seen[removed] = false;
            }

            stack.push(c);
            seen[c] = true;
        }

        // Build result from stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}

