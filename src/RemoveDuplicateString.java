import java.util.Stack;
/*
Q3
Given a string s, a k duplicate removal consists of choosing k adjacent and equal letters from s and
removing them causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made.

It is guaranteed that the answer is unique.

Example:
Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.

Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"
*/

public class RemoveDuplicateString {
	public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < sb.length(); ++i){
            if(i == 0 || sb.charAt(i) != sb.charAt(i-1)){
                stack.push(1);
            }else{
                int count = stack.pop() + 1;
                if(count == k){
                    sb.delete(i-k+1, i+1);
                    i = i - k;
                }else{
                    stack.push(count);
                }
            }
        }
        return sb.toString();
    }	

}
