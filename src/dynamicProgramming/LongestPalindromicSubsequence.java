package dynamicProgramming;

public class LongestPalindromicSubsequence {
	
	public static int length(String s1) {
		int len1 = s1.length();
		
		Integer dp [][] = new Integer[len1][len1];
		for(int g = 0 ; g < s1.length() ; g++) {
			
			for(int i = 0, j = g; j < dp.length ; i ++,j++) {
				if(g == 0) dp[i][j] = 1;
				else if(g == 1) dp[i][j] = s1.charAt(i) == s1.charAt(j) ? 2 : 1;
				else {
					if(s1.charAt(i) == s1.charAt(j)) {
						dp[i][j] = dp[i+1][j-1] + 2;
					}else {
						dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
					}
				}
			}
		}
		return dp[0][len1- 1];
	}

	public static void main(String[] args) {
		int a = 's' - 'a' + 1;
		System.out.println(a);
		

	}

}
