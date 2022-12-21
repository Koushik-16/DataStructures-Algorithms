package dynamicProgramming;

public class MaximumGold {
	
	public static int pathWithMaxGold(int [][] grid) {
		int n = grid.length ;
		int m = grid[0].length;
		int dp [][] = new int[n][m];
		int max = 0;
		for(int j = m -1 ; j >=  0; j --) {
			for(int i = 0 ; i < n ; i++) {
				if(j == m - 1) {
					dp[i][j] = grid[i][j];
				}else if(i == 0) {
					dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j+1] ) + grid[i][j];
				} else if(i == n - 1) {
					dp[i][j] = Math.max(dp[i-1][j+1], dp[i][j+1]) + grid[i][j];
				}else {
					dp[i][j] = Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1])) + grid[i][j];
				}
			}
		}
		int k = 0;
		for(int i = 0; i < n ; i++ ) {
			max = Math.max(max, dp[i][k]);
		}
		return max;
	}

	public static void main(String[] args) {
		

	}

}
