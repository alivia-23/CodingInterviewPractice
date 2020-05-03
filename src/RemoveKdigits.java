import java.util.Stack;

/* Q9
	Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
	
	Note:
	The length of num is less than 10002 and will be >= k.
	The given num does not contain any leading zero.
	
	Input: num = "1432219", k = 3
	Output: "1219"
	Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
	
	Input: num = "10200", k = 1
	Output: "200"
	Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
	
	Input: num = "10", k = 2
	Output: "0"
	Explanation: Remove all the digits from the number and it is left with nothing which is 0.
	*/
public class RemoveKdigits {
   public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : num.toCharArray()){
            while(!stack.isEmpty() && stack.peek() > c && k >0){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        while(!stack.isEmpty() && k != 0 ){
            stack.pop();
            k--;
        }
       
        StringBuilder sb = new StringBuilder();
        
        // convert stack to string
        while(!stack.isEmpty()){  
            // insert top elements of stack in 0th index of string                       
            sb.insert(0, stack.pop());  
        }
        
        //remove leading zeroes
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }

}
