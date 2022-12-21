package dynamicProgramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	
	public static boolean wordBreak(String s , List<String> dic) {
		Boolean dp [] = new Boolean[s.length()];
		Set<String> set = new HashSet<>();
		for(int i = 0 ; i < dic.size() ; i++) {
			set.add(dic.get(i));
		}
		return helper(s,0,dp,set);
	}
	public static boolean helper(String s , int pos, Boolean dp [], Set<String> set) {
		if(pos == s.length()) return true;
		if(dp[pos] != null) return dp[pos];
		for(int i = pos ; i < s.length() ; i++) {
			if(set.contains(s.substring(pos, i+ 1))) {
				boolean c = helper(s,i+1,dp,set);
				if(c == true) return dp[pos] = true;
			}
		}
		return dp[pos] = false;
	}

	public static void main(String[] args) {
		
	}

}
