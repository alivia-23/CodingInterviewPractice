import java.util.HashSet;
// Question: 10
/*
 * Check if there are duplicates in k distance
 * 
 * There is a string and we have to figure out if there are duplicates in K
 * distance. Input: string: "ABCADEB", K = 3 Output : false
 * 
 * Input: string: "ABACDEB", K = 3 Output : true
 * 
 */
public class CheckDuplicatesKdistance {

	public static void main(String[] args) {
		String s1 = "ABCADEB";
        int k1 = 3;
        System.out.println(duplicatesInKDistance(s1,k1));
        String s2 = "ABACDEB";
        int k2 = 3;
        System.out.println(duplicatesInKDistance(s2,k2));
	}
	
	static boolean duplicatesInKDistance(String s, int k) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i< s.length(); i++) {
			if(set.size() >= k) {
				set.remove(s.charAt(i-k));
			}
			if(set.contains(s.charAt(i))) {
				return true;
			}
			set.add(s.charAt(i));
		}
		return false;
	}

}
