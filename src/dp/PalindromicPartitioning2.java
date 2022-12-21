package dp;

public class PalindromicPartitioning2 {
	
	public static int minCuts(String s ) {
		int n = s.length();
		boolean pal [][] = new boolean[n][n];
		for(int g = 0 ; g < n ; g++) {
			for(int i = 0 , j = g ; j < pal.length ; i++,j++) {
				if(g == 0) pal[i][j] = true;
				else if(g == 1) pal[i][j] = s.charAt(i) == s.charAt(j);
				else {
					if(s.charAt(i) == s.charAt(j) && pal[i+1][j-1] == true) pal[i][j] = true;
					else pal[i][j] = false;
				}
			}
		}
		int dp[] = new int[n];
		dp[0] = 0;
		for(int j = 1 ; j < n ; j++) {
			if(pal[0][j]) {
				dp[j] = 0;
			}else {
			int min = Integer.MAX_VALUE;
			for(int i = j ; i >= 1; i--) {
				if(pal[i][j]) {
					if(dp[i-1] < min) min = dp[i-1];
				}
			}
			dp[j] = min + 1;
			}
		}
		return dp[n - 1];
	}

	public static void main(String[] args) {
		System.out.println(minCuts("bccb"));

	}

}
 