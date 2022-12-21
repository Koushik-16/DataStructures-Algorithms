package backtracking;

import java.util.HashSet;
import java.util.List;

public class WordBreak {
	
	public static boolean wordBreak(String s , List<String> dic) {
		HashSet<String> set = new HashSet<>();
		for(String t : dic) set.add(t);
		return helper(s,set);
	}

	public static boolean helper(String s, HashSet<String> set) {
		if(s == "") return true;
		for(int i = 0 ; i <= s.length()  ; i++) {
			if(set.contains(s.substring(0,i))) {
				if(helper(s.substring(i),set)) return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
