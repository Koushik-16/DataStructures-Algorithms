package dp;

public class StockBuyAndSellKTransaction {
	
	public int solve(int[] a, int k) {
        int dp [][] = new int[k+ 1][a.length];
		for(int i = 1 ; i < dp.length ; i++) {
            int max  = Integer.MIN_VALUE;
			for(int j = 1 ; j < dp[0].length ; j++) {
			max = Math.max(dp[i-1][j-1] - a[j-1],max);
            dp[i][j] = Math.max(dp[i][j-1],max + a[j]);
		}
        }
		return dp[dp.length -1][dp[0].length - 1];
    }

	public static void main(String[] args) {
		

	}

}
