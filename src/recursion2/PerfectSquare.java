package recursion2;

public class PerfectSquare {
	
	public static int minNumber(int n ) {
		int dp [] = new int[n+1];
		dp[0] = 0;
		for(int i = 1; i < dp.length ; i++) {
			int min = Integer.MAX_VALUE;
		      for(int j = 1 ; j*j <= i ; j++ ) {
		    	  min = Math.min(min,dp[i-j*j]);
		      }
		      dp[i] = min + 1;
		}
		return dp[n];
	}

	public static void main(String[] args) {
		

	}

}
