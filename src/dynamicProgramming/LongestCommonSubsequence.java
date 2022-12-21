package dynamicProgramming;

public class LongestCommonSubsequence {
	
	// longest common subsequence
	
	public static int lengthOfLCS(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int max =0;
		int dp [][] = new int[len1 + 1][len2 + 1];
		for(int i = 0; i < dp.length ; i++ ) {
			for(int j = 0 ; j < dp[0].length ; j++) {
				if(i == 0 || j == 0) dp[i][j] = 0;
				else if(i != 0 && j != 0) {
					if(s1.charAt(i -1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
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
