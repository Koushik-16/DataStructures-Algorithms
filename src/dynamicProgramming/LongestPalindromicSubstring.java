package dynamicProgramming;

public class LongestPalindromicSubstring {

	public static int lengthOfLPS(String s) {
		int len = s.length();
		int max = 0;
		boolean dp[][] = new boolean[len][len];
		for(int g = 0 ;g < len ; g++) {
			for(int i = 0, j = g ; j < len ; i++,j ++) {
				if(g == 0) dp[i][j] = true;
				else if(g == 1) dp[i][j] = s.charAt(i) == s.charAt(j);
				else {
					if(s.charAt(i) == s.charAt(j) && dp[i+1][j -1] == true) dp[i][j] = true;
					else dp[i][j] = false;
				}
				if(dp[i][j] == true) max = g + 1;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		

	}

}
