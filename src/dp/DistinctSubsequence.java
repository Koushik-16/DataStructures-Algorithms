package dp;

public class DistinctSubsequence {
	
	public static  int numDistinct(String s, String t) {
        int n = s.length();
		int m = t.length();
		int dp [][] = new int[n + 1][m+1];
		for(int i = 0; i < dp.length ; i++) dp[i][0] = 1;
		for(int j = 1 ; j < dp[0].length ; j++) dp[0][j] = 0;
		for(int i = 1; i < dp.length ; i++) {
			for(int j = 1; j < dp[0].length ; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		
		}
		return dp[n][m] ;
    }

	public static void main(String[] args) {
		

	}

}
