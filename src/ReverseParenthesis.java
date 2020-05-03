import java.util.Stack;
/* Q12 You are given a string s that consists of lower case English letters and brackets. 

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should not contain any brackets.


Example 1:

Input: s = "(abcd)"
Output: "dcba"
Example 2:

Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
Example 3:

Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
Example 4:

Input: s = "a(bcdefghijkl(mno)p)q"
Output: "apmnolkjihgfedcbq" */

public class ReverseParenthesis {
	
	public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder());
       
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(new StringBuilder());
            }
            else if(ch == ')'){
                String str = stack.pop().reverse().toString();
                stack.peek().append(str);
            }
            else{
                stack.peek().append(ch);
            }
        }
        return stack.peek().toString();
    }
}
