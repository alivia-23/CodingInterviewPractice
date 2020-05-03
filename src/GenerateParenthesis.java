import java.util.ArrayList;
import java.util.List;

/*
Q12
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/
public class GenerateParenthesis {
	public List<String> generateParenthesis(int n){
		List<String> result = new ArrayList<String>();
		generate(result, "", n, n);
		return result;
	}
	
	public void generate(List<String> result, String str, int left, int right) {
		if(left < 0 || right < 0 || left > right) {
			return;
		}
		if(left == 0 && right == 0) {
			result.add(str);
			return;
		}
		
		generate(result, str + "(", left - 1, right);
		generate(result, str + ")", left, right - 1);
	}

}
