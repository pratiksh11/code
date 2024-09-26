import java.util.Stack;

public class reverse {
    static class Solution {
        public void reverseString(char[] s) {
            Stack<Character> stack = new Stack<>();
            int idx = 0;
            while (idx < s.length) {
                stack.push(s[idx]);
                idx++;
            }
            idx = 0;
            while (!stack.isEmpty()) {
                s[idx] = stack.pop();
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input);
        System.out.println(input); // Output should be "olleh"
    }
}
