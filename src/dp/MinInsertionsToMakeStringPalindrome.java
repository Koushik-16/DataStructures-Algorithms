package dp;

public class MinInsertionsToMakeStringPalindrome {
	
	// length of string - longest palindromic subsequence
	// longest palindromic subsequence = lcs of string and its reversed form
	
	public static int MinInsertions(String s) {
		return s.length() - lps(s);
	}
	
    public static int lps(String s) {  // longest palindromic subsequence
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		String t = sb.reverse().toString();
		return lcs(s,t);
	}
	
	public static int lcs(String s1, String s2) { // Longest common subsequence
		int n = s1.length();
		int m = s2.length();
		 int dp [][] = new int[n + 1][m + 1];
		 int max = 0;
		 for(int i = 0; i < dp.length ; i++) {
			 for(int j =0 ; j < dp[0].length; j ++) {
				 if(i == 0 || j == 0) dp[i][j] = 0;
				 else if(i != 0 && j != 0) {
					 if(s1.charAt(i-1) == s2.charAt(j -1)) dp[i][j] = dp[i-1][j-1] + 1;
					 else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				 }
				 max = Math.max(max, dp[i][j]);
			 }
		 }
		 return max;
	}

	public static void main(String[] args) {
		

	}

}
