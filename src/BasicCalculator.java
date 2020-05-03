import java.util.Stack;

/* Bonus (LC224 Basic Calculator)
	Implement a basic calculator to evaluate a simple expression string.
	The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
	
	Input: "1 + 1"
	Output: 2
	Input: " 2-1 + 2 "
	Output: 3
	Input: "(1+(4+5+2)-3)+(6+8)"
	Output: 23
	*/
public class BasicCalculator {
	 public int calculate(String s) {
        int result = 0; int sign = 1;  //result is 0 initially. 0 + ...
        Stack<Integer> stack = new Stack<>();
        int n = s.length();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int currentNum = 0; // holds the current number (e.g. - 123)
            if(c >= '0' && c <= '9') {
                currentNum = c - '0';
                while(i < n-1 && s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9') {
                    currentNum  = 10 * currentNum + s.charAt(i+1) - '0';
                    i++;
                }
                result = result + currentNum * sign; // Update result              
            } else if(c == '+') {
                sign = 1;
            } else if(c == '-') {
                sign = -1;
            } else if(c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if(c == ')') {
                result = stack.pop() * result + stack.pop(); 
            }
        }
        return result;
    }
}
