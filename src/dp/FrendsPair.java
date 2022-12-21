package dp;

public class FrendsPair {
	
	public static int ways(int n ) {
		int dp [] = new int[n];
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3 ; i < n ; i++) {
			dp[i] = dp[i-1] + (i-1)*dp[i-2];
		}
		return dp[n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
