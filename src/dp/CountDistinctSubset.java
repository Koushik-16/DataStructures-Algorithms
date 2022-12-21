package dp;

import java.util.HashMap;

public class CountDistinctSubset {
	
	public static int distinctSubset(String s ) {
		int n = s.length();
		int dp [] = new int[n+ 1];
		dp[0] = 1;
		HashMap<Character,Integer> lo = new HashMap<>();
		for(int i = 1 ; i < dp.length ; i++ ) {
			dp[i] = dp[i-1] * 2;
		  char ch = s.charAt(i - 1);
		  if(lo.containsKey(ch)) {
			  int prev = lo.get(ch);
			  dp[i] = dp[i] - dp[prev-1];
		  }
		  lo.put(ch, i);
		}
		return dp[n];
	}

	public static void main(String[] args) {
		

	}

}
