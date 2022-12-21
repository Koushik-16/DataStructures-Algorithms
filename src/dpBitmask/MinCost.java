package dpBitmask;

public class MinCost {
	static Integer dp[][] = new Integer[21][1<<21];
	public static int solve(int i , int cost [][], int mask) {
		if(i == cost.length) return 0;
		if(dp[i][mask] != null) return dp[i][mask];
		int ans = Integer.MAX_VALUE;
		for(int j = 0 ; j < cost.length ; j++) {
			if((mask&(1<<j)) == 1) {
				ans = Math.min(ans, cost[j][i] + solve(i+1,cost,mask^(1<<j)));
			}
		}
		return dp[i][mask] = ans;
	}

	public static void main(String[] args) {
	

	}

}
