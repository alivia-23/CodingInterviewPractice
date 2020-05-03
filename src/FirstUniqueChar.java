
import java.util.HashMap;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String s1 = "leetcode";
		String s2 = "loveleetcode";
		String s3 = "lloo";
		FirstUniqueChar obj = new FirstUniqueChar();
		int firstUniqueIndex1 = obj.firstUniqueChar(s1);
		int firstUniqueIndex2 = obj.firstUniqueChar(s2);
		int firstUniqueIndex3 = obj.firstUniqueChar(s3);
		
		System.out.println("FirstUniqueIndex1: " +firstUniqueIndex1+"\n"+
				           "FirstUniqueIndex2: " +firstUniqueIndex2 +"\n"+
				           "FirstUniqueIndex3: " +firstUniqueIndex3 +"\n"
				              );
		
	}
    
	public int firstUniqueChar(String s) {
		HashMap<Character, Integer> charcount = new HashMap<Character,Integer>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(charcount.containsKey(c)) {
				int count = charcount.get(c);
				count++;
				charcount.put(c, count);
			}else {
				charcount.put(c,1);
			}
		}
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(charcount.get(c) == 1) {
				return i;
			}
		}
		return -1;
    }
}
