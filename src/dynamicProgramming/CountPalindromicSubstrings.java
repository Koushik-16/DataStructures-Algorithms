package dynamicProgramming;

public class CountPalindromicSubstrings {
	
	public static int count(String s) {
		int len = s.length();
		int count = 0;
		boolean dp [][] = new boolean[len][len];
		for(int g = 0; g < len ; g++) {
			for(int i = 0 , j = g; j < len ; i++ , j++) {
				if(g == 0) dp[i][j] = true;
				else if(g == 1) dp[i][j] = s.charAt(i) == s.charAt(j);
				else {
					if(s.charAt(i) == s.charAt(j) && dp[i+1][j -1] == true) dp[i][j] = true;
					else dp[i][j] = false;
				}
				if(dp[i][j] == true) count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		

	}

}
