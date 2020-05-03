import java.util.Stack;

/* Q6
	Evaluate the value of an arithmetic expression in Reverse Polish Notation.
	
	Valid operators are +, -, *, /. Each operand may be an integer or another expression.
	
	Note:
	Division between two integers should truncate toward zero.
	The given RPN expression is always valid.
	That means the expression would always evaluate to a result and there won't be any divide by zero operation.
	
	Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
	Output: 22
	Explanation: 
	  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
	= ((10 * (6 / (12 * -11))) + 17) + 5
	= ((10 * (6 / -132)) + 17) + 5
	= ((10 * 0) + 17) + 5
	= (0 + 17) + 5
	= 17 + 5
	= 22
	
	Input: ["4", "13", "5", "/", "+"]
	Output: 6
	Explanation: (4 + (13 / 5)) = 6
	*/
public class EvalRPN {
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int secondOperand;
        int firstOperand;
        
        for(String token : tokens){
            
            switch(token){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    secondOperand = stack.pop();
                    firstOperand = stack.pop();
                    stack.push(firstOperand - secondOperand);
                    break;
                case "/":
                    secondOperand = stack.pop();
                    firstOperand = stack.pop();
                    stack.push(firstOperand / secondOperand);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

}
