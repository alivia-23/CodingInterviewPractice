/*
Q15
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings
even they consist of same characters.

Examples:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
*/
public class CountSubstring {
	int count = 1;
	public int countSubstring(String s) {
		if(s.length() == 0) {
			return 0;
		}
		for(int i = 0; i < s.length()-1; i++) {
			findPalindrome(s, i, i);
			findPalindrome(s, i, i+1);
		}
		return count;
	}
	
	private void findPalindrome(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left --;
			right++;
		}
	}

}
