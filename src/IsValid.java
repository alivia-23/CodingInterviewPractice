import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* Q2
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	An input string is valid if:
	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Note that an empty string is also considered valid.
	
	Input: "()"
	Output: true
	
	Input: "()[]{}"
	Output: true
	
	Input: "(]"
	Output: false
	
	Input: "{[]}"
	Output: true
	*/

public class IsValid {
	 public boolean isValid(String s) {
	        Map<Character, Character> map = new HashMap<>();
	        
	        map.put(')','(');
	        map.put('}','{');
	        map.put(']','[');
	        
	        Stack<Character> stack = new Stack<Character>();
	        
	        for(char c : s.toCharArray()) {
	            if(map.keySet().contains(c)) { // is closing bracket
	               if(stack.isEmpty())
	                  return false;
	               char ch = stack.pop();
	               if(ch != map.get(c))
	                   return false;
	          
	            } else {
	                stack.push(c);            
	            }
	        }
	        return stack.isEmpty();
	 }
}
