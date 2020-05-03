import java.util.Stack;
/* Q5 Given a balanced parentheses string S, compute the score of the string based on the following rule:

() has score 1
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.
 

Example 1:

Input: "()"
Output: 1
Example 2:

Input: "(())"
Output: 2
Example 3:

Input: "()()"
Output: 2
Example 4:

Input: "(()(()))"
Output: 6 */

public class ScoreOfParentheses {
	public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack();
        stack.push(0); 

        for (char c: S.toCharArray()) {
            if (c == '(')
                stack.push(0);
            else {
                int prev = stack.pop();
                int cur = (prev == 0) ? 1 : 2 * prev;
                stack.push(stack.pop() + cur);
            }
        }
        return stack.pop();
    }
}
