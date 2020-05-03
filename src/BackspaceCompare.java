import java.util.Stack;

/* Q4
	Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
	
	Input: S = "ab#c", T = "ad#c"
	Output: true
	Explanation: Both S and T become "ac".
	
	Input: S = "ab##", T = "c#d#"
	Output: true
	Explanation: Both S and T become "".
	*/
public class BackspaceCompare {
	 public boolean backspaceCompare(String S, String T) {
	    String s1= build(S);
	    String s2 = build(T);
	    return s1.equals(s2);       
	 }
	    
     public String build(String S){
        Stack<Character> stack = new Stack<Character>();
        for(char c : S.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
     }
}
