import java.util.Stack;
/*
Q11
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers,k.
For example, there won't be input like 3a or 2[4].

Example:
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
*/

public class EncodeDecodeString {
	public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
		Stack<String> resultStack = new Stack<>();
		resultStack.push("");
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int start = i;
			if( Character.isDigit(ch)) {
				while(i+1 < s.length() && Character.isDigit(s.charAt(i+1))) {
					i++;
				}
				int num = Integer.parseInt(s.substring(start, i+1));
				countStack.push(num);				
			} else if(ch == '[') {
				resultStack.push("");
			} else if(ch == ']') {
				String temp = resultStack.pop();
				StringBuilder sb = new StringBuilder();
				int count = countStack.pop();
				for(int j=0; j< count; j++) {
					sb.append(temp);
				}
				resultStack.push(resultStack.pop() + sb.toString());
			} else { // [a-z]
				resultStack.push(resultStack.pop() + ch);
			}
		}
		return resultStack.pop();
    }

}
